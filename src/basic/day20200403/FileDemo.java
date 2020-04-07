package basic.day20200403;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/*
使用IO流操作文件
java.io.File对象可以表示为文件，也可以表示为目录
import java.nio.file.Path便于操作目录
 */
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("D:\\personal.txt");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
//        f.createNewFile();
//        f.mkdir(); // 创建目录，不包括不存在的父目录
//        f.mkdirs(); // 创建目录，包括不存在的父目录
//


    }
}
