package basic.day20200420.easyTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Timer;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("Hello! I'm a client.".getBytes());
        os.flush();
        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
//        while((len = is.read(buffer)) == 0) {
//            Thread.sleep(1000);
//        }
        len = is.read(buffer);
        System.out.println(new String(buffer, 0, len));

    }
}
