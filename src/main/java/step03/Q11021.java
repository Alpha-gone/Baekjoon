package step03;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q11021 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nA, nB;

        nTest = Cast.StoInt(IO.input());

        for (int i = 0; i < nTest; i++) {
            st = new StringTokenizer(IO.input(), " ");
            nA = Cast.StoInt(st.nextToken());
            nB = Cast.StoInt(st.nextToken());

            IO.write("Case #" + Cast.ItoString(i + 1) + ": " + Cast.ItoString(nA + nB));
        }

        IO.endProg();

    }
}
