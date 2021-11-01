package Function;

import java.io.*;

public class IO {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static String bInput() throws IOException{
        return br.readLine(); 
    }

    public static void bWrite(String sStr) throws IOException{
        bw.write(sStr);
    }

    public static void EndProg() throws IOException{
        bw.flush();
        bw.close();
        br.close();
    }
}
