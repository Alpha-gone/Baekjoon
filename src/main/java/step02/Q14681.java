package step02;

import java.io.*;
import Function.*;

public class Q14681 {
    public static void main(String[] args) throws IOException {
        int nX, nY;

        nX = Cast.StoInt(IO.input());
        nY = Cast.StoInt(IO.input());

        if (nX > 0 && nY > 0) {
            IO.write("1");
        } else if (nX < 0 && nY > 0) {
            IO.write("2");
        } else if (nX < 0 && nY < 0) {
            IO.write("3");
        } else if (nX > 0 && nY < 0) {
            IO.write("4");
        }

        IO.endProg();
    }
}