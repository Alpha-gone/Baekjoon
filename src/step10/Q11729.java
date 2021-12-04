package step10;

import java.io.IOException;

import Function.*;
    
public class Q11729 {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        int input = Cast.StoInt(IO.bInput());

        hanoi(input, 1, 2, 3);
        IO.EndProg();
    }

    public static void hanoi(int panel, int start, int work, int target) throws IOException{
        count++;

        if(panel == 1){
            IO.bWrite(Cast.ItoString(start) + " " + Cast.ItoString(target));
            return;
        }else{
            hanoi(panel - 1, start, target, work);
            //IO.bWrite(Cast.ItoString(panel));
            hanoi(panel - 1, )
        }
    } 
}
