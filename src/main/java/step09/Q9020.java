package step09;

import java.io.IOException;
import java.util.Arrays;
import Function.*;

public class Q9020 {
    public static void main(String[] args) throws IOException {
        int nTest, nNum, nFirst, nSencond;
        boolean[] bPrime = new boolean[10001];
        boolean bWhile = true;

        Arrays.fill(bPrime, true);
        bPrime[0] = false;
        bPrime[1] = false;

        for (int i = 2; (i * i) < 10001; i++) {
            if (bPrime[i]) {
                for (int j = i * i; j < 10001; j += i) {
                    bPrime[j] = false;
                }
            }
        }

        nTest = Cast.StoInt(IO.bInput());

        for (int i = 0; i < nTest; i++) {
            nNum = Cast.StoInt(IO.bInput());
            nFirst = nNum / 2;
            nSencond = nNum / 2;

            while (bWhile) {
                if (bPrime[nFirst] == true && bPrime[nSencond] == true) {
                    IO.bWrite(Cast.ItoString(nFirst) + " " + Cast.ItoString(nSencond) + "\n");
                    bWhile = false;
                }
                nFirst--;
                nSencond++;
            }

            bWhile = true;
        }
        IO.EndProg();
    }
}