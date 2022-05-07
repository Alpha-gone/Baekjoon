package step03;

import java.io.*;
import Function.*;

public class Q2742 {
    public static void main(String[] args) throws IOException {
        int nTest;

        nTest = Cast.StoInt(IO.input());

        for (int i = nTest; i >= 1; i--) {
            IO.write(Cast.ItoString(i) + "\n");
        }

        IO.endProg();
    }
}
