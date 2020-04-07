package basic.day20200407;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileRead {
    public static void main(String[] args) {
        FileRead fr = new FileRead();
        fr.readDir(new File("D:\\JavaProject\\java_practice\\src"), 0);


        Path path = Paths.get("..", "day20200403");
        path.normalize();
    }

    public void readDir(File f, int level) {
        String head = getHead(level);
        if (f.isDirectory()) {
            System.out.println(head + f.getName()+"\\");
            File[] files = f.listFiles();
            for (File file : files) {
                readDir(file, level+1);
            }
        } else if (f.isFile()) {
            System.out.println(head + f.getName());
        }
    }

    public void mkFile(File file) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getHead(int level){
        char[] chars = new char[level];
        for (int i = 0; i < level; i++) {
            chars[i] = '\t';
        }
        return String.valueOf(chars);
    }
}


