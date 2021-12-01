package step07;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q2675 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nRept;
        String sInput;

        nTest = Cast.StoInt(IO.bInput());

        for (int i = 0; i < nTest; i++) {
            st = new StringTokenizer(IO.bInput(), " ");
            nRept = Cast.StoInt(st.nextToken());
            sInput = st.nextToken();

            for (int j = 0; j < sInput.length(); j++) {
                IO.bWrite(Cast.CtoString(sInput.charAt(j)).repeat(nRept));
            }

            IO.bWrite("\n");
        }

        IO.EndProg();
    }
}