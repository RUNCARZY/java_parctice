package basic.day20200407;

import java.io.File;

/*
FileFilter接口：
重写abstract accept(File pathname)，符合条件的file返回true

FileNameFilter接口：
重写boolean accept(File dir, String name) ，测试指定文件是否应包含在文件列表中。


 */
public class FileFilterDemo {
    public static void main(String[] args) {
        File f = new File("F:\\java_project\\practice\\src\\basic\\day20200407");

        File[] fs = f.listFiles(f1->f1.getName().toString().startsWith("File")); // 注意开头不为路径名开头，是文件名开头
//        File[] fs = f.listFiles(f1->f1.toString().startsWith("File"));
        for (File file : fs) {
            System.out.println(file);
        }

        File[] fs2 = f.listFiles((dir, file)->new File(dir, file).isDirectory());//列出目录下所有的文件夹
        for (File file : fs2) {
            System.out.println(file);
        }
    }
}
