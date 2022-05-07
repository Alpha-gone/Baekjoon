package step05;

import java.io.*;
import java.util.Arrays;
import Function.*;

public class Q2577 {
    public static void main(String[] args) throws IOException {
        int[] arNum = new int[10];
        int nMul = 1;

        Arrays.fill(arNum, 0);

        for (int i = 0; i < 3; i++) {
            nMul *= Cast.StoInt(IO.input());
        }

        for (int i = 0; i < Cast.ItoString(nMul).length(); i++) {
            arNum[Character.getNumericValue(Cast.ItoString(nMul).charAt(i))]++;
        }

        for (int i = 0; i < 10; i++) {
            IO.write(Cast.ItoString(arNum[i]) + "\n");
        }

        IO.endProg();

    }
}