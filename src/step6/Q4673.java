package step6;

import java.io.*;
import java.util.Arrays;
import Function.*;

public class Q4673 {
    public static int selfNum(int nNum) {
        int nSum = nNum;

        while (nNum != 0) {
            nSum += nNum % 10;
            nNum /= 10;
        }

        return nSum;
    }

    public static void main(String[] args) throws IOException {
        boolean[] arCheck = new boolean[10000];

        Arrays.fill(arCheck, false);

        for (int i = 1; i <= arCheck.length; i++) {
            if (selfNum(i) < arCheck.length + 1) {
                arCheck[selfNum(i) - 1] = true;
            }

        }

        for (int i = 0; i < arCheck.length; i++) {
            if (!arCheck[i]) {
                IO.bWrite(Cast.ItoString(i + 1) + "\n");
            }
        }

        IO.EndProg();
    }
}
