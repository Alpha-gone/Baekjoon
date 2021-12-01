package step09;

import java.io.IOException;
import Function.*;

public class Q2581 {
    public static void main(String[] args) throws IOException {
        int nStart, nEnd, nSum = 0, nMin = 0;
        boolean bCheck;

        nStart = Cast.StoInt(IO.bInput());
        nEnd = Cast.StoInt(IO.bInput());

        for (int i = nStart; i < nEnd; i++) {
            bCheck = true;

            if (i < 2) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    bCheck = false;
                    break;
                }
            }

            if (bCheck) {
                nSum += i;
                if (nMin == 0) {
                    nMin = i;
                }
            }
        }

        if (nMin != 0) {
            IO.bWrite(Cast.ItoString(nSum) + "\n");
            IO.bWrite(Cast.ItoString(nMin));
        } else {
            IO.bWrite("-1");
        }

        IO.EndProg();
    }
}
