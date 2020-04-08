package basic.day20200407;

import java.io.*;

public class CopyCase {
    public static void main(String[] args) throws IOException {


        if (args.length == 2) {
            copy(args);
        }


    }
    public static boolean copy(String[] args){
        byte[] buffer = new byte[100]; // 设置缓冲区大小
        String origin = args[0];
        String target = args[1];
        try(InputStream input = new FileInputStream(origin);
            OutputStream output = new FileOutputStream(target)) {
            for (int i; (i = input.read(buffer)) != -1;) {
                output.write(buffer, 0, i);

            }
            output.flush();
            return true;
        }
        catch (IOException e) {
            System.out.println("参数错误!");
            e.printStackTrace();
            return false;
        }
    }
}
