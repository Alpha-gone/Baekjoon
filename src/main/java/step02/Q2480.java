package step02;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q2480 {
    public static void main(String[] args) throws IOException {
        StringTokenizer stringTokenizer;
        int firstDice, secondDice, thirdDice, reward = 0;
        List<Integer> inputDices = new ArrayList<>();

        stringTokenizer = new StringTokenizer(IO.input(), " ");
        firstDice = Cast.StoInt(stringTokenizer.nextToken());
        inputDices.add(firstDice);

        secondDice = Cast.StoInt(stringTokenizer.nextToken());
        inputDices.add(secondDice);

        thirdDice = Cast.StoInt(stringTokenizer.nextToken());
        inputDices.add(thirdDice);

        Collections.sort(inputDices);

        if (firstDice == secondDice && firstDice == thirdDice){
            reward = 10000 + firstDice * 1000;
        }else if(firstDice == secondDice){
            reward = 1000 + firstDice * 100;
        }else if(secondDice == thirdDice){
            reward = 1000 + secondDice * 100;
        }else if(thirdDice == firstDice){
            reward = 1000 + thirdDice * 100;
        }else{
            reward = inputDices.get(2) * 100;
        }

        IO.write(Cast.ItoString(reward));

        IO.endProg();
    }
}
