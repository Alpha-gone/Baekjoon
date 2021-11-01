package step9;

import java.io.IOException;
import java.util.StringTokenizer;

import Function.*;

public class Q1002 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nX1, nY1, nR1, nX2, nY2, nR2;

        nTest = Cast.StoInt(IO.bInput());

        for (int i = 0; i < nTest; i++) {
            st = new StringTokenizer(IO.bInput(), " ");
            nX1 = Cast.StoInt(st.nextToken());
            nY1 = Cast.StoInt(st.nextToken());
            nR1 = Cast.StoInt(st.nextToken());
            nX2 = Cast.StoInt(st.nextToken());
            nY2 = Cast.StoInt(st.nextToken());
            nR2 = Cast.StoInt(st.nextToken());

            if (nX1 == nX2 && nY1 == nY2 && nR1 == nR2) {
                IO.bWrite("-1\n");
            } else if (Math.pow(nX2 - nX1, 2) + Math.pow(nY2 - nY1, 2) > Math.pow(nR1 + nR2, 2)) {
                IO.bWrite("0\n");
            } else if (Math.pow(nX2 - nX1, 2) + Math.pow(nY2 - nY1, 2) < Math.pow(nR2 - nR1, 2)) {
                IO.bWrite("0\n");
            } else if (Math.pow(nX2 - nX1, 2) + Math.pow(nY2 - nY1, 2) == Math.pow(nR2 - nR1, 2)) {
                IO.bWrite("1\n");
            } else if (Math.pow(nX2 - nX1, 2) + Math.pow(nY2 - nY1, 2) == Math.pow(nR2 + nR1, 2)) {
                IO.bWrite("1\n");
            } else {
                IO.bWrite("2\n");
            }
        }

        IO.EndProg();
    }
}
