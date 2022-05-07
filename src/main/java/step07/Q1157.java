package step07;

import java.io.IOException;
import java.util.Arrays;
import Function.*;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        int[] arIndex = new int[26];
        int nMax, nIndex = 0;
        String sInput;
        boolean bCheck = false;

        Arrays.fill(arIndex, 0);

        sInput = IO.input().toUpperCase();

        while (sInput.length() != 0) {
            arIndex[sInput.charAt(0) - 'A'] = sInput.length()
                    - sInput.replace(String.valueOf(sInput.charAt(0)), "").length();
            sInput = sInput.replace(String.valueOf(sInput.charAt(0)), "");
        }

        // for(int i = 0; i < sInput.length(); i++){
        // arIndex[sInput.charAt(i) - 'A']++;
        // }

        nMax = 0;

        for (int i = 0; i < arIndex.length; i++) {
            if (arIndex[i] > nMax) {
                nMax = arIndex[i];
                nIndex = i;
                bCheck = false;
            } else if (arIndex[i] == nMax) {
                bCheck = true;
            }
        }

        if (bCheck) {
            IO.write("-1");
        } else {
            IO.write(Cast.CtoString((char) (nIndex + 'A')));
        }

        IO.endProg();
    }
}