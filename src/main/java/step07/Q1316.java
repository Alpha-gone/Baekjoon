package step07;

import java.io.IOException;
import Function.*;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        int nTest, nFIndex = 0, nLIndex = 0, nCount = 0;
        String sInput, sSub;
        boolean bCheck = true;
        nTest = Cast.StoInt(IO.bInput());

        for (int i = 0; i < nTest; i++) {
            sInput = IO.bInput();

            for (int j = 0; j < sInput.length(); j++) {
                nFIndex = sInput.indexOf(sInput.charAt(j));
                nLIndex = sInput.lastIndexOf(sInput.charAt(j));
                sSub = sInput.substring(nFIndex, nLIndex + 1);

                if (sSub.length() == 1) {
                    continue;
                }

                for (int k = 1; k < sSub.length(); k++) {
                    if (sSub.charAt(0) != sSub.charAt(k)) {
                        bCheck = false;
                        break;
                    }
                }

                if (!bCheck) {
                    break;
                }
            }

            if (bCheck) {
                nCount++;
            }

            bCheck = true;
        }

        IO.bWrite(Cast.ItoString(nCount));
        IO.bWrite("\n");
        IO.EndProg();
    }
}