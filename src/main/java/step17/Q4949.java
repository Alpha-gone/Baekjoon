package step17;

import Function.IO;

import java.io.IOException;
import java.util.Stack;

public class Q4949 {
    public static void main(String[] args) throws IOException {
        String input;

        while(true){
            input = IO.bInput();
            if(input.equals(".")){
                break;
            }

            System.out.println(checkBalance(input));
        }
    }

    private static String checkBalance(String inputString){
        char[] replacedString = inputString.replaceAll("\\w", "")
                    .toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char item : replacedString){
            char popItem;
            switch (item){
                case '(':
                case '[':
                    stack.push(item);
                    break;

                case ')':
                    if(stack.empty() || stack.peek() != '('){
                        return "no";
                    }else{
                        stack.pop();
                    }
                    break;

                case ']':
                    if(stack.empty() || stack.peek() != '['){
                        return "no";
                    }else{
                        stack.pop();
                    }
                    break;
            }
        }

        if(stack.empty()){
            stack.clear();
            return "yes";
        }else{
            stack.clear();
            return "no";
        }

    }
}
