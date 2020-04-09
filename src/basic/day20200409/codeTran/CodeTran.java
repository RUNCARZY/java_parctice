package basic.day20200409.codeTran;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class CodeTran {
    public static boolean translate(String source, String srcCode, String target, String tarCode) {
        try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(source), srcCode));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(target), tarCode));){
            int len = 0;
            char[] chars = new char[1024];
            while((len = in.read(chars)) != -1) {
                out.write(chars, 0, len);
            }
            out.flush();
            return true;
        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }


    }
}
