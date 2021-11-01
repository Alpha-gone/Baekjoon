package step8;

import java.io.IOException;
import Function.*;

public class Q2292 {
    public static void main(String[] args) throws IOException {
        int nInput, nLine = 0, nMax = 1;

        nInput = Cast.StoInt(IO.bInput());

        while (nInput > nMax) {
            nLine++;
            nMax += 6 * nLine;
        }

        IO.bWrite(Cast.ItoString(nLine + 1));
        IO.EndProg();
    }
}
