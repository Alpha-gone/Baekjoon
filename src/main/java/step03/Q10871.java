package step03;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nX, nNum;

        st = new StringTokenizer(IO.input(), " ");
        nTest = Cast.StoInt(st.nextToken());
        nX = Cast.StoInt(st.nextToken());

        st = new StringTokenizer(IO.input(), " ");
        for (int i = 0; i < nTest; i++) {
            nNum = Cast.StoInt(st.nextToken());
            if (nX > nNum) {
                IO.write(Cast.ItoString(nNum) + " ");
            }
        }

        IO.endProg();

    }
}
