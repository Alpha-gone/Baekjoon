package step01;

import java.io.*;
import Function.*;

public class Q2588 {
    public static void main(String[] args) throws IOException {
        int nA, nSum = 0, nMul = 1;
        String sB;

        nA = Cast.StoInt(IO.input());
        sB = IO.input();

        for (int i = sB.length() - 1; i >= 0; i--) {
            IO.write(Cast.ItoString(nA * Cast.CtoInt(sB.charAt(i))) + "\n");
            nSum += nA * Cast.CtoInt(sB.charAt(i)) * nMul;
            nMul *= 10;
        }

        IO.write(Cast.ItoString(nSum));
        IO.endProg();

    }
}