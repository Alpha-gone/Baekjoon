package step04;

import java.io.*;
import Function.*;

public class Q1110 {
    public static void main(String[] args) throws IOException {
        int nStart, nA, nB, nNum, nCount = 1;
        boolean bWhile = true;

        nStart = Cast.StoInt(IO.input());
        nNum = nStart;

        while (bWhile == true) {
            if (nNum < 10) {
                nA = 0;
            } else {
                nA = nNum / 10;
            }
            nB = nNum % 10;
            nNum = nB * 10 + (nA + nB) % 10;

            if (nStart == nNum) {
                bWhile = false;
                continue;
            }
            nCount++;

        }
        IO.write(Cast.ItoString(nCount));

        IO.endProg();

    }
}
