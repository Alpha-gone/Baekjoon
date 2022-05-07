package step07;

import java.io.IOException;
import Function.*;

public class Q5622 {
    public static void main(String[] args) throws IOException {
        int nTime = 0;
        String sInput;

        sInput = IO.input().toUpperCase();
        for (int i = 0; i < sInput.length(); i++) {
            switch (sInput.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    nTime += 3;
                    break;

                case 'D':
                case 'E':
                case 'F':
                    nTime += 4;
                    break;

                case 'G':
                case 'H':
                case 'I':
                    nTime += 5;
                    break;

                case 'J':
                case 'K':
                case 'L':
                    nTime += 6;
                    break;

                case 'M':
                case 'N':
                case 'O':
                    nTime += 7;
                    break;

                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    nTime += 8;
                    break;

                case 'T':
                case 'U':
                case 'V':
                    nTime += 9;
                    break;

                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    nTime += 10;
                    break;
            }
        }

        IO.write(Cast.ItoString(nTime));

        IO.endProg();
    }
}
