package basic.day20200407;

import java.io.*;

public class CopyCase {
    public static void main(String[] args) throws IOException {


        if (args.length == 2) {
            copy(args);
        }


    }
    public static void copy(String[] args){
        byte[] buffer = new byte[100]; // 设置缓冲区大小
        String origin = args[0];
        String target = args[1];
        try(InputStream input = new FileInputStream(origin)) {
            try (OutputStream output = new FileOutputStream(target)) {
                for (int i = 1; input.read(buffer)!=-1; i++) {
                    output.write(buffer);
                    System.out.println("第" + i + "次读写");
                }
                output.flush();
            }
        }
        catch (IOException e) {
            System.out.println("参数错误!");
            e.printStackTrace();
        }
    }
}
