package step02;

import java.io.*;
import Function.*;

public class Q9498 {
    public static void main(String[] args) throws IOException {
        int nA;

        nA = Cast.StoInt(IO.input());

        if (nA >= 90) {
            IO.write("A");
        } else if (nA >= 80) {
            IO.write("B");
        } else if (nA >= 70) {
            IO.write("C");
        } else if (nA >= 60) {
            IO.write("D");
        } else {
            IO.write("F");
        }

        IO.endProg();

    }
}