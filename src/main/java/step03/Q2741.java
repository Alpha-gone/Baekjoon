package step03;

import java.io.*;
import Function.*;

public class Q2741 {
    public static void main(String[] args) throws IOException {
        int nTest, nSum = 0;

        nTest = Cast.StoInt(IO.input());

        for (int i = 1; i <= nTest; i++) {
            nSum += i;
        }

        IO.write(Cast.ItoString(nSum));
        IO.endProg();

    }
}
