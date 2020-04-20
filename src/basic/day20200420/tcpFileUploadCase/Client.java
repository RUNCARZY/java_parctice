package basic.day20200420.tcpFileUploadCase;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread t0 = new Thread(()->upload("F:\\Downloads\\Java JDK 7学习笔记.pdf"));
        Thread t1 = new Thread(()->upload("F:\\Downloads\\Java编辑思想（第四版）.pdf"));
        Thread t2 = new Thread(()->upload("F:\\Downloads\\Java核心技术（卷2）第8版.pdf"));
        Thread t3 = new Thread(()->upload("F:\\Downloads\\Java核心技术(卷1）第8版.pdf"));
        Thread t4 = new Thread(()->upload("F:\\Downloads\\Java从入门到精通.pdf"));
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t0.join();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }

    public static void upload(String origin){
        try {
            Socket socket = new Socket("127.0.0.1", 8080);
            InputStream fis = new FileInputStream(origin);
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            System.out.println(origin + "开始上传");
            while((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println(origin + "上传完毕");
            socket.shutdownOutput();
            len = is.read(buffer);
            System.out.println(new String(buffer, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
