package step19;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11866V2 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        StringTokenizer stringTokenizer;
        int queueSize, filterNum;

        stringTokenizer = new StringTokenizer(IO.input(), " ");
        queueSize = Cast.StoInt(stringTokenizer.nextToken());
        filterNum = Cast.StoInt(stringTokenizer.nextToken());


        for (int i = 1; i <= queueSize; i++){
            queue.add(i);
        }

        while (!queue.isEmpty()){
            for (int i = 0; i< filterNum - 1; i++){
                queue.add(queue.poll());
            }

            arrayList.add(Cast.ItoString(queue.poll()));
        }

        IO.write("<");
        IO.write(String.join(", ", arrayList) + ">");
        IO.endProg();
    }
}
