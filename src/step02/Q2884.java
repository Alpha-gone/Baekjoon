package step02;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nH, nM;

        st = new StringTokenizer(IO.bInput(), " ");
        nH = Cast.StoInt(st.nextToken());
        nM = Cast.StoInt(st.nextToken());

        if (nM - 45 > 0) {
            IO.bWrite(Cast.ItoString(nH) + " " + Cast.ItoString(nM));
        } else if (nH == 0) {
            IO.bWrite("23 " + Cast.ItoString(60 + (nM - 45)));
        } else {
            IO.bWrite(Cast.ItoString(nH - 1) + " " + Cast.ItoString(60 + (nM - 45)));
        }

        IO.EndProg();
    }
}