package step9;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nX, nY, nW, nH, nMinX, nMinY;

        st = new StringTokenizer(IO.bInput(), " ");
        nX = Cast.StoInt(st.nextToken());
        nY = Cast.StoInt(st.nextToken());
        nW = Cast.StoInt(st.nextToken());
        nH = Cast.StoInt(st.nextToken());

        nMinX = Math.min(nX, nW - nX);
        nMinY = Math.min(nY, nH - nY);

        IO.bWrite(Cast.ItoString(Math.min(nMinX, nMinY)));

        IO.EndProg();
    }
}