package step19;

import Function.Cast;
import Function.IO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q11866 {
    public static void main(String[] args) throws IOException {
        MyCircleQueue myCircleQueue = new MyCircleQueue();
        ArrayList<String> josepus = new ArrayList<>();
        StringTokenizer stringTokenizer;
        int peopleCount, filterNum;

        stringTokenizer = new StringTokenizer(IO.input(), " ");

        peopleCount = Cast.StoInt(stringTokenizer.nextToken());
        filterNum = Cast.StoInt(stringTokenizer.nextToken());

        for(int i = 1; i <= peopleCount; i++){
           myCircleQueue.offer(i);
        }



        int loopCount = 1;
        while (!myCircleQueue.isEmpty()){
            if(loopCount % filterNum == 0){
                josepus.add(myCircleQueue.poll());
            }else{
                myCircleQueue.moveFrontToNext();
            }

            loopCount++;
        }

        IO.write("<");
        IO.write(String.join(", ", josepus));
        IO.write(">");

        IO.endProg();
    }
}

class MyCircleQueue{
    private Node front;
    private Node rear;
    private int size = 0;

    public MyCircleQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void offer(int data){
        Node node = new Node(data);

        if(size == 0){
            front = node;
        }else{
            node.setLLink(rear);
            rear.setRLink(node);
        }

        rear = node;

        rear.setRLink(front);
        front.setLLink(rear);

        size++;
    }

    public String poll(){
        if(isEmpty()){
            return "Queue is Empty";
        }

        int value = front.getData();
        Node next = front.getRLink();

        if(next == null){
            front = null;
            rear = null;
        }else{
            front.getRLink().setLLink(front.getLLink());
            front.getLLink().setRLink(next);
        }

       front.setData(null);
       front.setRLink(null);
       front.setLLink(null);

       front = next;

       size--;

        return Integer.toString(value);
    }

    public String peek(){
        if (isEmpty()){
            return "Queue is Empty";
        }

        return Integer.toString(front.getData());
    }

    public void moveFrontToNext(){
        front = front.getRLink();
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }else {
            return false;
        }
    }
}

class Node{
    private Integer data;

    private Node rLink;
    private Node lLink;

    public Node(Integer data){
        this.data = data;
        this.lLink = null;
        this.rLink = null;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setRLink(Node link) {
        this.rLink = link;
    }

    public Node getRLink() {
        return rLink;
    }

    public void setLLink(Node lLink) {
        this.lLink = lLink;
    }

    public Node getLLink() {
        return lLink;
    }
}