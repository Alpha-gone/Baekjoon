package step3;

import java.io.*;
import Function.*;

public class Q2438 {
    public static void main(String[] args) throws IOException {;
        int nTest;

        nTest = Cast.StoInt(IO.bInput());

        for (int i = 1; i <= nTest; i++) {
            IO.bWrite("*".repeat(i) + "\n");
        }

        IO.EndProg();

    }
}
