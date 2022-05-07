package step08;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q1011 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nDistence, nMax;
        int nX = 0, nY = 0;

        nTest = Cast.StoInt(IO.input());

        for (int i = 0; i < nTest; i++) {
            st = new StringTokenizer(IO.input(), " ");
            nX = Cast.StoInt(st.nextToken());
            nY = Cast.StoInt(st.nextToken());

            nDistence = nY - nX;
            nMax = (int) Math.sqrt(nDistence);

            if (nMax == Math.sqrt(nDistence)) {
                IO.write(Cast.ItoString(nMax * 2 - 1));
            } else if (nDistence <= nMax * nMax + nMax) {
                IO.write(Cast.ItoString(nMax * 2));
            } else {
                IO.write(Cast.ItoString(nMax * 2 - 1));
            }

        }

        IO.endProg();
    }
}
