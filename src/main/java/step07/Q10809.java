package step07;

import java.io.IOException;
import java.util.Arrays;

import Function.*;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        int[] arIndex = new int[26];
        String sInput;

        Arrays.fill(arIndex, -1);

        sInput = IO.bInput();

        for (int i = 0; i < sInput.length(); i++) {
            if (arIndex[sInput.charAt(i) - 'a'] == -1) {
                arIndex[sInput.charAt(i) - 'a'] = i;
            }
        }

        for (int i = 0; i < arIndex.length; i++) {
            IO.bWrite(Cast.ItoString(arIndex[i]) + " ");
        }

        IO.EndProg();

    }
}
