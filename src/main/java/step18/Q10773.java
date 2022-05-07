package step18;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.Stack;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        int countOfCommend, inputNum;
        int stackSum = 0;

        countOfCommend = Cast.StoInt(IO.input());

        for (int i = 0; i < countOfCommend; i++){
            inputNum = Cast.StoInt(IO.input());

            if(inputNum != 0){
                stack.push(inputNum);
            }else{
                stack.pop();
            }
        }

        for (int item : stack){
            stackSum += item;
        }

        System.out.println(stackSum);
    }
}
