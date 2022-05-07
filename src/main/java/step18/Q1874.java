package step18;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.Stack;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int startPushStack = 0;
        int endPushStack, makeSequence;
        boolean isFail = false;

        endPushStack = Cast.StoInt(IO.input());

        for(int i = 0; i < endPushStack; i++){
            makeSequence = Cast.StoInt(IO.input());

            if(makeSequence > startPushStack){
                for(int j = startPushStack + 1; j <= makeSequence; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }

                startPushStack = makeSequence;

            }else if(stack.peek() != makeSequence){
                isFail = true;
                break;

            }

            stack.pop();
            sb.append("-\n");

        }
        if(isFail){
            System.out.println("NO");
        }else{
            System.out.println(sb);
        }

        IO.endProg();
    }
}
