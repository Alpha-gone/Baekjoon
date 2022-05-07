package step07;

import java.io.IOException;
import Function.*;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        String[] sChro = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        String sInput;

        sInput = IO.input();

        for (int i = 0; i < sChro.length; i++) {
            sInput = sInput.replace(sChro[i], Cast.ItoString(i));
        }

        IO.write(Cast.ItoString(sInput.length()));

        IO.endProg();
    }
}
