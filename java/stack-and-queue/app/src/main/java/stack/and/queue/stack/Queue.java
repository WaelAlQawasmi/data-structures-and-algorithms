package stack.and.queue.stack;

import java.util.NoSuchElementException;

public class Queue {
    private static final int QueueSize = 10;
    private Node front;
    private Node back;
    private int size;

    public Queue() {
        this.size = 0;
    }

    public boolean isEmpty() {
        if( front == null)
        return  true;
        else
            return false;

    }


    public void enqueue(Node newNode) {
        if (isEmpty()) {
            front = newNode;
            back = newNode;
            size++;

                   }
        else {
            if (size < QueueSize) {
                newNode.setNext(back);
                back = newNode;
                size++;
                          }
        }

    }



    public String peek() {
        if (isEmpty()) {
            return null;
        } else{
            return front.getValue();
        }
    }


    public String dequeue() {
        Node frontTemp;
        if (isEmpty()) {
            return null;
           // throw new NoSuchElementException("The queue is empty");

        } else {
            frontTemp = front;

            front = front.getNext(); // removes the first node
        }

        return frontTemp.getValue();
    }

    @Override
    public String toString() {

        Node pointer= this.front;
        String OUTPUT="";
        while (pointer!=null){
            OUTPUT+=pointer.getValue()+" =>";
            pointer=pointer.getNext();
        }

        return "Queue{" +
                 OUTPUT +
                '}';
    }
}
