package step05;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import Function.*;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nSub;
        double[] arNum;
        double nMax, nSum = 0;

        nSub = Cast.StoInt(IO.input());
        arNum = new double[nSub];
        Arrays.fill(arNum, 0);
        st = new StringTokenizer(IO.input(), " ");

        for (int i = 0; i < nSub; i++) {
            arNum[i] = Cast.StoInt(st.nextToken());
        }

        nMax = arNum[0];

        for (int i = 1; i < nSub; i++) {
            if (arNum[i] > nMax) {
                nMax = arNum[i];
            }
        }

        for (int i = 0; i < nSub; i++) {
            arNum[i] = arNum[i] / nMax * 100;
            nSum += arNum[i];
        }

        IO.write(Cast.DtoString(nSum / nSub));
        IO.endProg();

    }
}
