package step18;

import Function.IO;

import java.io.IOException;
import java.util.Stack;

public class Q4949 {
    public static void main(String[] args) throws IOException {
        String input;

        while(true){
            input = IO.input();
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
                case ']':
                    try{
                        popItem = stack.pop();
                    }catch (Exception e){
                        return "no";
                    }

                    if(item == ')' && popItem != '(' ||
                        item == ']' && popItem != '[' ){
                        return "no";
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
