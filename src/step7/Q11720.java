package step7;

import java.io.*;
import Function.*;

public class Q11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nLength, nSum = 0;
        String sNum;

        nLength = Cast.StoInt(br.readLine());
        sNum = br.readLine();

        for (int i = 0; i < nLength; i++) {
            nSum += Cast.CtoInt(sNum.charAt(i));
        }
        bw.write(Cast.ItoString(nSum));
        bw.flush();
        br.close();
        bw.close();

    }
}
