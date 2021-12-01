package step08;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q1011 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nDistence, nMax;
        int nX = 0, nY = 0;

        nTest = Cast.StoInt(IO.bInput());

        for (int i = 0; i < nTest; i++) {
            st = new StringTokenizer(IO.bInput(), " ");
            nX = Cast.StoInt(st.nextToken());
            nY = Cast.StoInt(st.nextToken());

            nDistence = nY - nX;
            nMax = (int) Math.sqrt(nDistence);

            if (nMax == Math.sqrt(nDistence)) {
                IO.bWrite(Cast.ItoString(nMax * 2 - 1));
            } else if (nDistence <= nMax * nMax + nMax) {
                IO.bWrite(Cast.ItoString(nMax * 2));
            } else {
                IO.bWrite(Cast.ItoString(nMax * 2 - 1));
            }

        }

        IO.EndProg();
    }
}
