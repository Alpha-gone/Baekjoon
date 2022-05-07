package step19;

import Function.Cast;
import Function.IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q18258 {
    public static void main(String[] args) throws IOException {
        StringTokenizer stringTokenizer;
        //MyQueue myQueue;
        MyLinkedQueue<Integer> myQueue = new MyLinkedQueue<>();
        int commendCount;

        commendCount = Cast.StoInt(IO.input());

         for (int i = 0; i < commendCount; i++){
           stringTokenizer = new StringTokenizer(IO.input(), " ");

           switch (stringTokenizer.nextToken()){
               case "push":
                   myQueue.push(Cast.StoInt(stringTokenizer.nextToken()));
                   break;

               case "pop":
                   IO.write(myQueue.pop());
                   break;

               case "size":
                   IO.write(myQueue.size());
                   break;

               case "empty":
                   IO.write(myQueue.empty());
                   break;

               case "front":
                   IO.write(myQueue.front());
                   break;

               case "back":
                   IO.write(myQueue.back());
                   break;
           }
        }

        IO.endProg();
    }

}

class MyLinkedQueue<T>{
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public MyLinkedQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void push(T data){
        Node<T> newNode = new Node<T>(data);

        if(size == 0){
            front = newNode;
        }else{
            rear.setNextNode(newNode);
        }

        rear = newNode;
        size++;
    }

    public String pop(){
        if(size == 0){
            return "-1\n";
        }

        Node<T> oldNode = front;
        front = oldNode.getNextNode();
        size--;

        return oldNode.getData().toString() + "\n";
    }

    public String size(){
        return size +"\n";
    }

    public String empty(){
        if(size > 0){
            return "0\n";
        }else {
            return "1\n";
        }
    }

    public String front(){
        if(size == 0){
            return "-1\n";
        }

        return front.getData().toString() + "\n";
    }

    public String back(){
        if(size == 0){
            return "-1\n";
        }

        return rear.getData().toString() + "\n";
    }

    private class Node<T>{
        private T data;
        private Node<T> nextNode;

        public Node(T data){
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }
    }
}