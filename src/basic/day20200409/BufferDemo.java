package basic.day20200409;
/*
字节缓冲输出流：
BufferedOutputStream(OutputStream out)：默认缓冲区大小
BufferedOutputStream(OutputStream out, int size)：指定缓冲区大小
同样使用writer，flush, close方法进行操作，只需要关闭缓冲流，基本流会自动关闭。

字符缓冲输出流：
BufferedWriter(Writer writer)
BufferedWriter(Writer writer, int size)
特有方法：void newline()写入一个换行符，不必用关注操作系统之间换行符的差异


字节缓冲输入流：
BufferedInputStream(InputStream in):
BufferedInputStream(InputStream in, int size):
同样用read, close方法进行操作

字符缓冲输入流：
BufferedReader(Reader reader)
BufferedReader(Reader reader, int size)
特有方法：String readline()读取一行文本

 */
public class BufferDemo {
}
