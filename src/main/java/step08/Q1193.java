package step08;

import java.io.IOException;
import Function.*;

public class Q1193 {
    public static void main(String[] args) throws IOException {
        int nInput, nCrossCount = 1, nPreCrossCount = 0;
        boolean bWhile = true;

        nInput = Cast.StoInt(IO.input());

        while(bWhile){
            if(nInput <= nCrossCount + nPreCrossCount){
                if(nCrossCount % 2 == 1){
                    IO.write(Cast.ItoString(nCrossCount - (nInput - nPreCrossCount - 1)) + " / " 
                            + Cast.ItoString(nInput - nPreCrossCount));
                    bWhile = false;
                }else{
                    IO.write(Cast.ItoString(nInput - nPreCrossCount) + " / " 
                            + Cast.ItoString(nCrossCount - (nInput - nPreCrossCount - 1 )));
                    bWhile = false;
                }
            }

            nPreCrossCount += nCrossCount;
            nCrossCount++;
        }

        IO.endProg();
    }
}
