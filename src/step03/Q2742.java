package step03;

import java.io.*;
import Function.*;

public class Q2742 {
    public static void main(String[] args) throws IOException {
        int nTest;

        nTest = Cast.StoInt(IO.bInput());

        for (int i = nTest; i >= 1; i--) {
            IO.bWrite(Cast.ItoString(i) + "\n");
        }

        IO.EndProg();
    }
}
