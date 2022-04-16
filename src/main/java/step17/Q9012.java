package step17;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.Stack;

public class Q9012 {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        int countOfCommed;
        char[] inputPS;

        countOfCommed = Cast.StoInt(IO.bInput());

        for (int i = 0; i < countOfCommed; i++){
            inputPS = IO.bInput().toCharArray();

            for (char parenthesis : inputPS){
                if(parenthesis == '('){
                    stack.push(parenthesis);

                }else{
                    if(!stack.contains('(')){
                        stack.push(parenthesis);

                    }else{
                        stack.pop();
                    }
                }

            }

            if (stack.size() == 0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

            stack.clear();
        }
    }
}
