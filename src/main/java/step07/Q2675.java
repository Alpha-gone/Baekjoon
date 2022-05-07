package step07;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q2675 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nRept;
        String sInput;

        nTest = Cast.StoInt(IO.input());

        for (int i = 0; i < nTest; i++) {
            st = new StringTokenizer(IO.input(), " ");
            nRept = Cast.StoInt(st.nextToken());
            sInput = st.nextToken();

            for (int j = 0; j < sInput.length(); j++) {
                IO.write(Cast.CtoString(sInput.charAt(j)).repeat(nRept));
            }

            IO.write("\n");
        }

        IO.endProg();
    }
}