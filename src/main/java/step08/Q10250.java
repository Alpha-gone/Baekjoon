package step08;

import java.io.IOException;
import java.util.StringTokenizer;

import Function.*;

public class Q10250 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nTest, nH, nN;
        int nX = 0, nY = 0;

        nTest = Cast.StoInt(IO.bInput());

        for (int i = 0; i < nTest; i++) {
            st = new StringTokenizer(IO.bInput(), " ");
            nH = Cast.StoInt(st.nextToken());
            st.nextToken();
            nN = Cast.StoInt(st.nextToken());

            if(nN % nH == 0){
                nY = nH * 100;
                nX = nN / nH;
            }else{
                nY = (nN % nH) * 100;
                nX = nN / nH + 1;
            }

            IO.bWrite(Cast.ItoString(nY + nX) + "\n");
        }

        IO.EndProg();
    }
}
