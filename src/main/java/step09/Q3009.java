package step09;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q3009 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int[][] arRect = new int[3][2];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(IO.bInput(), " ");
            arRect[i][0] = Cast.StoInt(st.nextToken());
            arRect[i][1] = Cast.StoInt(st.nextToken());
        }

        if (arRect[0][0] == arRect[1][0]) {
            IO.bWrite(Cast.ItoString(arRect[2][0]) + " ");
        } else if (arRect[1][0] == arRect[2][0]) {
            IO.bWrite(Cast.ItoString(arRect[0][0]) + " ");
        } else if (arRect[0][0] == arRect[2][0]) {
            IO.bWrite(Cast.ItoString(arRect[1][0]) + " ");
        }

        if (arRect[0][1] == arRect[1][1]) {
            IO.bWrite(Cast.ItoString(arRect[2][1]));
        } else if (arRect[1][1] == arRect[2][1]) {
            IO.bWrite(Cast.ItoString(arRect[0][0]));
        } else if (arRect[0][1] == arRect[2][1]) {
            IO.bWrite(Cast.ItoString(arRect[1][1]));
        }

        IO.EndProg();
    }
}
