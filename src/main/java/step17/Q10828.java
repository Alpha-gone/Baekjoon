package step17;

import Function.Cast;
import Function.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828 {
    public static void main(String[] args) throws IOException {
        myStack stack;
        StringTokenizer stringTokenizer;
        int countOfCommend;

        countOfCommend = Cast.StoInt(IO.bInput());
        stack = new myStack(countOfCommend);

        for(int i = 0; i < countOfCommend; i++){
            stringTokenizer = new StringTokenizer(IO.bInput(), " ");

            switch (stringTokenizer.nextToken()){
                case "push":
                    stack.push(Cast.StoInt(stringTokenizer.nextToken()));
                    break;

                case "pop":
                    stack.pop();
                    break;

                case "size":
                    stack.showStackSize();
                    break;

                case "empty":
                    stack.isEmpty();
                    break;

                case "top":
                    stack.showStackTop();
                    break;

                default:
                    System.out.println("입력이 잘못 되었습니다.");
            }
        }

    }
}

class myStack{
    private int[] stack;
    private int positionOfTop;

    public myStack(int stackSize){
        this.stack = new int[stackSize];
        positionOfTop = -1;
    }

    public void push(int inputValue){
        this.stack[++positionOfTop] = inputValue;
    }

    public void pop(){
        if(positionOfTop != -1){
            System.out.println(this.stack[positionOfTop--]);
        }else{
            System.out.println(-1);
        }

    }

    public void showStackSize(){
        System.out.println(positionOfTop + 1);
    }

    public void isEmpty(){
        if(positionOfTop == -1){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    public void showStackTop(){
        if(positionOfTop != -1){
            System.out.println(stack[positionOfTop]);
        }else{
            System.out.println(-1);
        }
    }

}