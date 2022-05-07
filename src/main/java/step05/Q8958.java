package step05;

import java.io.*;

import Function.*;

public class Q8958 {
    public static void main(String[] args) throws IOException {
        int nTest, nScore = 1, nTotal = 0;
        String sResult;

        nTest = Cast.StoInt(IO.input());

        for (int i = 0; i < nTest; i++) {
            sResult = IO.input().toUpperCase();
            for (int j = 0; j < sResult.length(); j++) {
                if (sResult.charAt(j) == 'X') {
                    nScore = 0;
                }

                nTotal += nScore;
                nScore++;
            }

            IO.write(Cast.ItoString(nTotal) + "\n");

            nTotal = 0;
            nScore = 1;
        }

        IO.endProg();
    }
}
