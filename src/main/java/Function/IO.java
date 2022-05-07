package Function;

import java.io.*;
import java.io.BufferedReader;

public class IO {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static String input() throws IOException{
        return br.readLine(); 
    }

    public static int inputN() throws IOException{
        return br.read();
    }

    public static void write(String sStr) throws IOException{
        bw.write(sStr);
    }

    public static void write(char[] arChar) throws IOException{
        bw.write(arChar);
    }

    public static void endProg() throws IOException{
        bw.flush();
        bw.close();
        br.close();
    }
}
