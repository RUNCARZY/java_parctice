package basic.day20200407;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
InputStream是java中所有输入流的超类
两个常用实现类：FileInputStream 和 ByteArrayInputStream

FileInputStream：
构造方法：FileInputStream(String path)。获取文件输入流
read() 读取下一个字节
int read(byte[] b); 读取b长度的字节数到buffer中
int read(byte[] b, int off, int len)：指定byte[]数组的偏移量和最大填充数

用try(资源){}的方式让系统自动关闭资源，不必显式调用close方法

ByteArrayInputStream():
可模拟输入流，用于测试


 */
public class InputStreamDemo {
    public static void main(String[] args) {
        try (InputStream input = new FileInputStream("D:\\JavaProject\\java_practice\\src\\basic\\day20200407\\test.txt")) {
            int n;
            while ((n=input.read()) != -1) {
                System.out.print((char)n);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
