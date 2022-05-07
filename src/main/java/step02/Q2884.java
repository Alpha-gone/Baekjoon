package step02;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nH, nM;

        st = new StringTokenizer(IO.input(), " ");
        nH = Cast.StoInt(st.nextToken());
        nM = Cast.StoInt(st.nextToken());

        if (nM - 45 > 0) {
            IO.write(Cast.ItoString(nH) + " " + Cast.ItoString(nM));
        } else if (nH == 0) {
            IO.write("23 " + Cast.ItoString(60 + (nM - 45)));
        } else {
            IO.write(Cast.ItoString(nH - 1) + " " + Cast.ItoString(60 + (nM - 45)));
        }

        IO.endProg();
    }
}