package step18;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.Stack;

public class Q9012 {
    public static void main(String[] args) throws IOException {
        int countOfCommed;
        String inputPS;

        countOfCommed = Cast.StoInt(IO.input());

        for (int i = 0; i < countOfCommed; i++){
            inputPS = IO.input();

            checkPS(inputPS);
        }
    }

    public static void checkPS(String inputPS){
        char[] inputPSArr = inputPS.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char parenthesis : inputPSArr){
            if(parenthesis == '('){
                stack.push(parenthesis);

            }else{
                try{
                    stack.pop();
                }catch (Exception e){
                    System.out.println("NO");
                    return;
                }
            }

        }

        if (stack.size() == 0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
