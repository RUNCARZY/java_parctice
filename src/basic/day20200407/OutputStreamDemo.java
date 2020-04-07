package basic.day20200407;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/*
OutputStream是java中所有输出流的超类
output缓冲区：实质上是一个byte数组，当缓冲区满的时候，java会将缓冲区的内容发送出去。在缓冲区没满时，必须手动调用flush()方法进行发送。
(为了避免频繁的io操作，InputStream实际上也有一个缓冲区，使用指针指向下次read的未读缓冲区，读完后再重新加载内容到缓冲区中)

FileOutputStream：
使用write()方法写入数据，会覆盖原有内容

 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        try (OutputStream out = new FileOutputStream("test.txt")) {
            out.write('x');
            out.write("我是大英雄".getBytes(StandardCharsets.UTF_8));
            out.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
