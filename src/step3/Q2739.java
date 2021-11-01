package step3;

import java.io.*;
import Function.*;

public class Q2739 {
    public static void main(String[] args) throws IOException {
        int nNum;

        nNum = Cast.StoInt(IO.bInput());

        for (int i = 1; i < 10; i++) {
            IO.bWrite(Cast.ItoString(nNum) + " * " + Cast.ItoString(i) + " = "
                    + Cast.ItoString(nNum * i));
            IO.bWrite("\n");

        }

        IO.EndProg();

    }
}