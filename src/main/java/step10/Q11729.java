package step10;

import java.io.IOException;

import Function.*;
    
public class Q11729 {
    static int count = 0;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        int input = Cast.StoInt(IO.bInput());

        hanoi(input, 1, 2, 3);
        IO.bWrite(Cast.ItoString(count) + "\n");
        IO.bWrite(sb.toString());
        IO.EndProg();
    }

    public static StringBuffer hanoi(int panel, int start, int mid, int target){
        count++;

        if(panel == 1){
            sb.append(Cast.ItoString(start) + " " + Cast.ItoString(target) + "\n");
            return sb;
        }else{
            hanoi(panel - 1, start, target, mid);
            sb.append(Cast.ItoString(start) + " " + Cast.ItoString(target) + "\n");
            hanoi(panel - 1, mid, start, target);
            return sb;
        }
    } 
}
