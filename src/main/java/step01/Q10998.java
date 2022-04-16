package step01;

import java.io.*;
import java.util.*;
import Function.*;

public class Q10998 {
    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(IO.bInput(), " ");
        int nA, nB;

        nA = Cast.StoInt(st.nextToken());
        nB = Cast.StoInt(st.nextToken());

        IO.bWrite(Cast.ItoString(nA * nB));
        IO.EndProg();

    }
}