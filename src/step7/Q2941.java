package step7;

import java.io.IOException;
import Function.*;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        String[] sChro = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        String sInput;

        sInput = IO.bInput();

        for (int i = 0; i < sChro.length; i++) {
            sInput = sInput.replace(sChro[i], Cast.ItoString(i));
        }

        IO.bWrite(Cast.ItoString(sInput.length()));

        IO.EndProg();
    }
}
