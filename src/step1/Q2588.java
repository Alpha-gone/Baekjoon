package step1;

import java.io.*;
import Function.*;

public class Q2588 {
    public static void main(String[] args) throws IOException {
        int nA, nSum = 0, nMul = 1;
        String sB;

        nA = Cast.StoInt(IO.bInput());
        sB = IO.bInput();

        for (int i = sB.length() - 1; i >= 0; i--) {
            IO.bWrite(Cast.ItoString(nA * Cast.CtoInt(sB.charAt(i))) + "\n");
            nSum += nA * Cast.CtoInt(sB.charAt(i)) * nMul;
            nMul *= 10;
        }

        IO.bWrite(Cast.ItoString(nSum));
        IO.EndProg();

    }
}