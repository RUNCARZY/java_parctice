package basic.day20200420.easyTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket accept= server.accept();
        InputStream is = accept.getInputStream();
        byte[] buffer = new byte[1024];
        int len = is.read(buffer);
        System.out.println(new String(buffer, 0, len));
        OutputStream os =accept.getOutputStream();
        os.write("200".getBytes());
        accept.close();
        server.close();
    }
}
