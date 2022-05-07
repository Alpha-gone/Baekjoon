package step08;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q1712 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nA, nB, nC;

        st = new StringTokenizer(IO.input(), " ");
        nA = Cast.StoInt(st.nextToken());
        nB = Cast.StoInt(st.nextToken());
        nC = Cast.StoInt(st.nextToken());

        if (nB >= nC) {
            IO.write("-1");
        } else {
            IO.write(Cast.ItoString(nA / (nC - nB) + 1));
        }

        IO.endProg();
    }
}
