package step08;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q10757 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        String sA, sB;
        int[][] arNum;
        int nMaxLen;

        st = new StringTokenizer(IO.bInput(), " ");
        sA = st.nextToken();
        sB = st.nextToken();

        nMaxLen = Math.max(sA.length(), sB.length());
        arNum = new int[3][nMaxLen + 1];
        
        for(int i = sA.length() - 1, index = 0; i >= 0; i--, index++){
            arNum[0][index] = Cast.CtoInt(sA.charAt(i));
        }

        for(int i = sB.length() - 1, index = 0; i >= 0; i--, index++){
            arNum[1][index] = Cast.CtoInt(sB.charAt(i));
        }

        for(int i = nMaxLen, index = 0; i >= 1; i--, index++){
            arNum[2][i] += (arNum[0][index] + arNum[1][index]) % 10;
            arNum[2][i - 1] += (arNum[0][index] + arNum[1][index]) / 10;
        }

        for(int i = 0; i < arNum[2].length; i++){
            IO.bWrite(Cast.ItoString(arNum[2][i]));
        }

        IO.EndProg();
    }
}
