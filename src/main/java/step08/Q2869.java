package step08;

import java.io.IOException;
import java.util.StringTokenizer;

import Function.*;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int nA, nB, nV, nDay;

        st = new StringTokenizer(IO.bInput(), " ");
        nA = Cast.StoInt(st.nextToken());
        nB = Cast.StoInt(st.nextToken());
        nV = Cast.StoInt(st.nextToken());

        nDay = (nV - nB) / (nA - nB);

        if((nV - nB) % (nA - nB) != 0){
            nDay++;
        }

        // nDay = Math.ceil((double)(nV - nA) / (nA - nB));
        IO.bWrite(Cast.ItoString(nDay));

        IO.EndProg();
    }
}
