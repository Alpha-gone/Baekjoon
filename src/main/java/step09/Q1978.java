package step09;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nNum, nCount = 0;
        boolean bCheck;

        nTest = Cast.StoInt(IO.input());
        st = new StringTokenizer(IO.input(), " ");

        for (int i = 0; i < nTest; i++) {
            bCheck = true;
            nNum = Cast.StoInt(st.nextToken());

            if (nNum < 2) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(nNum); j++) {
                if (nNum % j == 0) {
                    bCheck = false;
                    break;
                }
            }

            if (bCheck) {
                nCount++;
            }
        }

        IO.write(Cast.ItoString(nCount));

        IO.endProg();
    }
}
