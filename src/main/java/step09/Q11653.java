package step09;

import java.io.IOException;
import Function.*;

public class Q11653 {
    public static void main(String[] args) throws IOException {
        int nInput, nPrime = 2;

        nInput = Cast.StoInt(IO.input());

        while (nInput != 1) {
            if (nInput % nPrime == 0) {
                IO.write(Cast.ItoString(nPrime) + "\n");
                nInput /= nPrime;
            } else {
                nPrime++;
            }
        }

        IO.endProg();
    }
}
