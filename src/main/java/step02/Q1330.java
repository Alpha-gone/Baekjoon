package step02;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q1330 {
  public static void main(String[] args) throws IOException {
    StringTokenizer st;
    int nA, nB;

    st = new StringTokenizer(IO.bInput(), " ");
    nA = Cast.StoInt(st.nextToken());
    nB = Cast.StoInt(st.nextToken());

    if (nA > nB) {
      IO.bWrite(">");
    } else if (nA < nB) {
      IO.bWrite("<");
    } else {
      IO.bWrite("==");
    }

    IO.EndProg();

  }
}