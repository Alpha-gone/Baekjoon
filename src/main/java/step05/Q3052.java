package step05;

import java.io.*;
import java.util.Arrays;
import Function.*;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        int nCount = 0;
        boolean[] arCheck = new boolean[42];

        Arrays.fill(arCheck, false);

        for (int i = 0; i < 10; i++) {
            arCheck[Cast.StoInt(IO.input()) % 42] = true;
        }

        for (int i = 0; i < arCheck.length; i++) {
            if (arCheck[i]) {
                nCount++;
            }

        }

        IO.write(Cast.ItoString(nCount));
        IO.endProg();

    }
}
