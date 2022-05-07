package step19;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.*;

public class Q1966 {
    public static void main(String[] args) throws IOException {
        Queue<Document> queue = new LinkedList<>();
        StringTokenizer stringTokenizer;
        int testCaseCount, documentCount, findDoc;

        testCaseCount = Cast.StoInt(IO.input());

        for(int i = 0; i < testCaseCount; i++){
            stringTokenizer = new StringTokenizer(IO.input(), " ");
            documentCount = Cast.StoInt(stringTokenizer.nextToken());
            findDoc = Cast.StoInt(stringTokenizer.nextToken());

            stringTokenizer = new StringTokenizer(IO.input(), " ");

            for (int j = 0; j < documentCount; j++){
                if(j == findDoc){
                    queue.offer(new Document(-1, Cast.StoInt(stringTokenizer.nextToken())));
                }
                queue.offer(new Document(j, Cast.StoInt(stringTokenizer.nextToken())));
            }

            int loopCount = 1;
            while (true){
                Document pollDoc = queue.poll();
                boolean max = true;

                for (Document item : queue){
                    if(pollDoc.getPriority() < item.getPriority()){

                    }
                }


                loopCount++;
            }

            queue.clear();
        }


    }
}

class Document implements Comparable<Document>{
    private int docNum;
    private int priority;

    public Document(int docNum, int priority){
        this.docNum = docNum;
        this.priority = priority;
    }

    public int getDocNum() {
        return docNum;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Document doc) {
         if(this.priority > doc.priority){
            return 1;
        }else if(this.priority < doc.priority){
            return -1;
        }else{
             return 0;
         }
    }
}
