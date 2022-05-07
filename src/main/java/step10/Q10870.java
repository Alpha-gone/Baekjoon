package step10;

import java.io.IOException;
import Function.*;

public class Q10870 {
    public static void main(String[] args) throws IOException {
        int input = Cast.StoInt(IO.input());

        IO.write(Cast.ItoString(pibo(input)));
            
        
        IO.endProg();

    }   
    

    public static int pibo(int count){

        if(count != 0 && count != 1){
            return pibo(count -1) + pibo(count -2);
        }else if(count == 1 ){
            return 1;
        }else{
            return 0;
        }
    }
}
