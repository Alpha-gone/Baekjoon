package step10;

import java.io.IOException;

import Function.*;

public class Q10872 {
    public static void main(String[] args) throws IOException {
        int input = Cast.StoInt(IO.input());
        
        IO.write(Cast.ItoString(facto(input)));
        IO.endProg();
    }

    public static int facto(int num){
        if(num == 1) return 1;

        return num * facto(num -1);
    }
}