package step3;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nX, nNum;

        st = new StringTokenizer(IO.bInput(), " ");
        nTest = Cast.StoInt(st.nextToken());
        nX = Cast.StoInt(st.nextToken());

        st = new StringTokenizer(IO.bInput(), " ");
        for (int i = 0; i < nTest; i++) {
            nNum = Cast.StoInt(st.nextToken());
            if (nX > nNum) {
                IO.bWrite(Cast.ItoString(nNum) + " ");
            }
        }

        IO.EndProg();

    }
}
