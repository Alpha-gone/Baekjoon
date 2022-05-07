package step03;

import java.io.*;
import Function.*;

public class Q2439 {
    public static void main(String[] args) throws IOException {
        int nTest;

        nTest = Cast.StoInt(IO.input());

        for (int i = 1; i <= nTest; i++) {
            IO.write(" ".repeat(nTest - i));
            IO.write("*".repeat(i) + "\n");

        }

        IO.endProg();

    }
}
