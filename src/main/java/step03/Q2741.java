package step03;

import java.io.*;
import Function.*;

public class Q2741 {
    public static void main(String[] args) throws IOException {
        int nTest, nSum = 0;

        nTest = Cast.StoInt(IO.bInput());

        for (int i = 1; i <= nTest; i++) {
            nSum += i;
        }

        IO.bWrite(Cast.ItoString(nSum));
        IO.EndProg();

    }
}
