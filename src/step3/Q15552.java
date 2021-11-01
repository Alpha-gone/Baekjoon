package step3;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nA, nB;

        nTest = Cast.StoInt(IO.bInput());

        for (int i = 0; i < nTest; i++) {
            st = new StringTokenizer(IO.bInput(), " ");
            nA = Cast.StoInt(st.nextToken());
            nB = Cast.StoInt(st.nextToken());
            IO.bWrite(Cast.ItoString(nA + nB) + "\n");
        }

        IO.EndProg();
    }
}