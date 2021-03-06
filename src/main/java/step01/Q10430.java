package step01;

import java.io.*;
import java.util.*;
import Function.*;

public class Q10430 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(IO.input(), " ");
        int nA, nB, nC;

        nA = Cast.StoInt(st.nextToken());
        nB = Cast.StoInt(st.nextToken());
        nC = Cast.StoInt(st.nextToken());

        IO.write(Cast.ItoString((nA + nB) % nC) + "\n");
        IO.write(Cast.ItoString(((nA % nC) + (nB % nC)) % nC) + "\n");
        IO.write(Cast.ItoString((nA * nB) % nC) + "\n");
        IO.write(Cast.ItoString(((nA % nC) * (nB % nC)) % nC) + "\n");
        IO.endProg();

    }
}