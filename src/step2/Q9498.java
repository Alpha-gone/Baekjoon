package step2;

import java.io.*;
import Function.*;

public class Q9498 {
    public static void main(String[] args) throws IOException {
        int nA;

        nA = Cast.StoInt(IO.bInput());

        if (nA >= 90) {
            IO.bWrite("A");
        } else if (nA >= 80) {
            IO.bWrite("B");
        } else if (nA >= 70) {
            IO.bWrite("C");
        } else if (nA >= 60) {
            IO.bWrite("D");
        } else {
            IO.bWrite("F");
        }

        IO.EndProg();

    }
}