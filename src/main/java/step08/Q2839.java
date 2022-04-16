package step08;

import java.io.IOException;
import Function.*;

public class Q2839 {
    public static void main(String[] args) throws IOException {
        int nInput;

        nInput = Cast.StoInt(IO.bInput());

        if (nInput == 4 || nInput == 7) {
            IO.bWrite("-1");
        } else if (nInput % 5 == 0) {
            IO.bWrite(Cast.ItoString(nInput / 5));
        } else if (nInput % 5 == 1 || nInput % 5 == 3) { // nInput = 3 -> 3 % 5 == 3 3 /5 = 0 
            IO.bWrite(Cast.ItoString(nInput / 5 + 1));
        } else if (nInput % 5 == 2 || nInput % 5 == 4) {
            IO.bWrite(Cast.ItoString(nInput / 5 + 2));
        }

        IO.EndProg();
    }
}
