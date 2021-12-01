package step04;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q10952 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nA, nB;
        boolean bWhile = true;

        while (bWhile == true) {
            st = new StringTokenizer(IO.bInput(), " ");
            nA = Cast.StoInt(st.nextToken());
            nB = Cast.StoInt(st.nextToken());

            if (nA == 0 && nB == 0) {
                bWhile = false;
                continue;
            }

            IO.bWrite(Cast.ItoString(nA + nB) + "\n");

        }

        IO.EndProg();

    }
}
