package step02;

import java.io.*;
import Function.*;

public class Q2753 {
    public static void main(String[] args) throws IOException {
        int nYear;

        nYear = Cast.StoInt(IO.input());

        if (nYear % 4 == 0 && nYear % 100 != 0 || nYear % 400 == 0) {
            IO.write("1");
        } else {
            IO.write("0");
        }

        IO.endProg();
    }
}