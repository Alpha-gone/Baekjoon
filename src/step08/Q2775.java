package step08;

import java.io.IOException;
import Function.*;

public class Q2775 {
    public static void main(String[] args) throws IOException {
        int[][] apt = new int[15][15];
        int nTest, nK, nN;

        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++){
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }
        }

        nTest = Cast.StoInt(IO.bInput());
        for(int i = 0; i < nTest; i++){
            nK = Cast.StoInt(IO.bInput());
            nN = Cast.StoInt(IO.bInput());

            IO.bWrite(Cast.ItoString(apt[nK][nN]) + "\n");
        }
        IO.EndProg();
        }
}
