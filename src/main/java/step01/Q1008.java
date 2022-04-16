package step01;

import java.io.*;
import java.util.*;
import Function.*;

public class Q1008 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(IO.bInput(), " ");
        double nA, nB;

        nA = Cast.StoDouble(st.nextToken());
        nB = Cast.StoDouble(st.nextToken());

        IO.bWrite(Cast.DtoStrog(nA / nB));
        IO.EndProg();

    }
}