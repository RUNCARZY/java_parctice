package basic.day20200409.codeTran;

import java.io.*;

public class CodeTran {
    public static final int BUFFER_SIZE = 1024;


    public static boolean translateByBuffer(String source, String srcCode, String target, String tarCode) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(source), srcCode));
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(target), tarCode))) {
            int len = 0;
            char[] chars = new char[BUFFER_SIZE];
            while ((len = in.read(chars)) != -1) {
                out.write(chars, 0, len);
            }
            out.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean translateNoBuffer(String source, String srcCode, String target, String tarCode){
        try(InputStreamReader in = new InputStreamReader(new FileInputStream(source), srcCode);
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(target), tarCode)){
            int len = 0;
            char[] chars = new char[BUFFER_SIZE];
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
