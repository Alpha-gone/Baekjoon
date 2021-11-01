package step2;

import java.io.*;
import Function.*;

public class Q14681 {
    public static void main(String[] args) throws IOException {
        int nX, nY;

        nX = Cast.StoInt(IO.bInput());
        nY = Cast.StoInt(IO.bInput());

        if (nX > 0 && nY > 0) {
            IO.bWrite("1");
        } else if (nX < 0 && nY > 0) {
            IO.bWrite("2");
        } else if (nX < 0 && nY < 0) {
            IO.bWrite("3");
        } else if (nX > 0 && nY < 0) {
            IO.bWrite("4");
        }

        IO.EndProg();
    }
}