package step5;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int[] arNum;
        int nMax, nMin, nNum;

        nNum = Cast.StoInt(IO.bInput());
        st = new StringTokenizer(IO.bInput(), " ");
        arNum = new int[nNum];

        for (int i = 0; i < nNum; i++) {
            arNum[i] = Cast.StoInt(st.nextToken());
        }

        nMax = arNum[0];
        nMin = arNum[0];

        for (int i = 1; i < nNum; i++) {
            if (nMax < arNum[i]) {
                nMax = arNum[i];
            }
            if (nMin > arNum[i]) {
                nMin = arNum[i];
            }
        }

        IO.bWrite(Cast.ItoString(nMin) + " " + Cast.ItoString(nMax));
        IO.EndProg();

    }

}
