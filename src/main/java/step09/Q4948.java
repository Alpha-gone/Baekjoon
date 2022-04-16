package step09;

import java.io.IOException;
import Function.*;

public class Q4948 {
    public static void main(String[] args) throws IOException {
        int nNum, nCount = 0;
        boolean bCheck;

        while ((nNum = Cast.StoInt(IO.bInput())) != 0) {
            for (int i = nNum + 1; i <= nNum * 2; i++) {
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
                    nCount++;
                }
            }

            IO.bWrite(Cast.ItoString(nCount) + "\n");
            nCount = 0;
        }

        IO.EndProg();
    }
}