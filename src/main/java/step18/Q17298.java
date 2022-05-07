package step18;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class Q17298 {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Integer> indexStack= new Stack<>();
        int sizeOfSequence;
        int[] inputSequence;

        sizeOfSequence = Cast.StoInt(IO.input());
        inputSequence = Arrays.stream(IO.input().split(" ")).mapToInt(Integer::parseInt).toArray();


        for(int i = 0; i < sizeOfSequence; i++){
            while (!indexStack.isEmpty() && inputSequence[i] > inputSequence[indexStack.peek()]){
                    inputSequence[indexStack.pop()] = inputSequence[i];
            }

            indexStack.push(i);
        }

        for(int idx : indexStack){
            inputSequence[idx] = -1;
        }

        for (int value : inputSequence){
            IO.write(value + " ");
        }

        IO.endProg();
    }
}
