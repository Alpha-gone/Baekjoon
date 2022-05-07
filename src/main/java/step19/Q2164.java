package step19;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        int cardCount;

        cardCount = Cast.StoInt(IO.input());

        for (int i = 1; i <= cardCount; i++){
            queue.add(i);
        }

        int roofNum = 0;
        while (queue.size() != 1){
            if(roofNum % 2 == 0){
                queue.poll();
            }else {
                int temp = queue.poll();
                queue.add(temp);
            }

            roofNum++;
        }

        System.out.println(queue.peek());
    }
}
