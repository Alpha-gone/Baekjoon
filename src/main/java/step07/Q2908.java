package step07;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q2908 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(IO.input(), " ");
        StringBuffer sb;
        int[] arReNum = new int[2];

        for (int i = 0; i < arReNum.length; i++) {
            sb = new StringBuffer(st.nextToken());
            arReNum[i] = Cast.StoInt(sb.reverse().toString());
        }

        IO.write(Cast.ItoString(Math.max(arReNum[0], arReNum[1])));

        IO.endProg();
    }
}
