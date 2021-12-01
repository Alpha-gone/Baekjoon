package step09;

import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import Function.*;

public class Q1929 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nStart, nEnd;
        boolean[] bPrime;

        st = new StringTokenizer(IO.bInput(), " ");
        nStart = Cast.StoInt(st.nextToken());
        nEnd = Cast.StoInt(st.nextToken());

        bPrime = new boolean[nEnd + 1];
        Arrays.fill(bPrime, true);
        bPrime[0] = false;
        bPrime[1] = false;

        for (int i = 2; (i * i) <= nEnd; i++) {
            if (bPrime[i]) {
                for (int j = i * i; j <= nEnd; j += i) {
                    bPrime[j] = false;
                }
            }
        }

        for (int i = nStart; i < nEnd; i++) {
            if (bPrime[i]) {
                IO.bWrite(Cast.ItoString(i) + "\n");
            }
        }

        IO.EndProg();
    }
}
