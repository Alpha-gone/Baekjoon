package step05;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q4344 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nStudents, nIndex = 0, nSum = 0, nCount = 0;
        double dAvg = 0;
        int[] arScore;

        nTest = Cast.StoInt(IO.input());

        for (int i = 0; i < nTest; i++) {
            st = new StringTokenizer(IO.input(), " ");

            nStudents = Cast.StoInt(st.nextToken());
            arScore = new int[nStudents];

            while (st.hasMoreTokens()) {
                arScore[nIndex] = Cast.StoInt(st.nextToken());
                nSum += arScore[nIndex];
                nIndex++;
            }

            dAvg = (double) nSum / nStudents;

            for (int j = 0; j < nStudents; j++) {
                if (arScore[j] > dAvg) {
                    nCount++;
                }
            }

            IO.write(Cast.DtoString(Math.round(((double) nCount / nStudents * 100) * 1000) / 1000.0) + "%");

            nIndex = 0;
            nCount = 0;
            nSum = 0;

        }

        IO.endProg();

    }
}
