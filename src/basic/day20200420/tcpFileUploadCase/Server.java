package basic.day20200420.tcpFileUploadCase;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        final String target_dir = "F:\\无用文件";
        ServerSocket server = new ServerSocket(8080);

        File file = new File(target_dir);

        byte[] buffer = new byte[1024];
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        while(true) {
            Socket socket = server.accept();
            threadPool.submit(()->{
                try {
                    InputStream is = socket.getInputStream();
                    OutputStream os = socket.getOutputStream();
                    if(!file.exists()) {
                        file.mkdirs();
                    }
                    String target_file = target_dir + "\\" + System.currentTimeMillis() + ".pdf";
                    OutputStream fos = new FileOutputStream(target_file);
                    int len = 0;
                    System.out.println(Thread.currentThread().getName() + "开始接收文件");
                    while((len=is.read(buffer)) != -1) {
                        fos.write(buffer, 0, len);
                    }
                    os.write("上传文件成功".getBytes());
                    System.out.println(target_file + "已上传完毕！");
                    System.out.println(Thread.currentThread().getName() + "接收文件完成");
                    fos.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
