package step09;

import java.io.*;
import java.util.StringTokenizer;
import Function.*;

public class Q1002 {
    public static void main(String[] args) throws IOException{
        StringTokenizer st;
        int nTest , nDistence;
        int x1, y1, r1, x2, y2, r2;

        nTest = Cast.StoInt(IO.input());

        for(int i = 0; i < nTest; i++){
            st = new StringTokenizer(IO.input(), " ");    
            x1 = Cast.StoInt(st.nextToken());
            y1 = Cast.StoInt(st.nextToken());
            r1 = Cast.StoInt(st.nextToken());
            x2 = Cast.StoInt(st.nextToken());
            y2 = Cast.StoInt(st.nextToken());
            r2 = Cast.StoInt(st.nextToken());

            nDistence = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1 , 2));

            if(x1 == x2 && y1 == y2 && r1 == r2){
                IO.write("-1\n");
            }else if(nDistence > Math.pow(r1 + r2, 2)){
                IO.write("0\n");
            }else if(nDistence < Math.pow(r2 - r1, 2)){
                IO.write("0\n");
            }else if(nDistence == Math.pow(r2 - r1, 2)){
                IO.write("1\n");
            }else if(nDistence == Math.pow(r1 + r2, 2)){
                IO.write("1\n");
            }else{
                IO.write("2\n");
            }
        }
        
        IO.endProg();


    }
    
}
