package step01;

import java.io.*;
import java.util.*;
import Function.*;

public class Q1008 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(IO.input(), " ");
        double nA, nB;

        nA = Cast.StoDouble(st.nextToken());
        nB = Cast.StoDouble(st.nextToken());

        IO.write(Cast.DtoString(nA / nB));
        IO.endProg();

    }
}