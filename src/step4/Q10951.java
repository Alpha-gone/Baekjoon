package step4;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q10951 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nA, nB;
        boolean bWhile = true;

        while (bWhile == true) {
            st = new StringTokenizer(IO.bInput(), " ");
            nA = Cast.StoInt(st.nextToken());
            nB = Cast.StoInt(st.nextToken());

            IO.bWrite(Cast.ItoString(nA + nB) + "\n");
        }

        IO.EndProg();

    }
}
