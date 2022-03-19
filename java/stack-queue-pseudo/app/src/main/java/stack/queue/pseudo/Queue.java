package stack.queue.pseudo;


import java.util.NoSuchElementException;

public class Queue {
    private static final int QueueSize = 10;

    private stack data=new stack();
    private stack teprary=new stack();
    private int size;

    public Queue() {
        this.size = 0;
    }

    public boolean isEmpty() {
        if( data.peek() == null)
            return  true;
        else
            return false;

    }


    public Boolean enqueue(Node newNode) {
     if (isEmpty()) {
           data.push(newNode);
           size++;
           return true;
       }
       else {
           if(QueueSize>size){
               teprary.push(newNode);
           while (data.peek()!=null){
               Node TE=data.pop();
               teprary.push(TE);
           }
      while (teprary.peek()!=null){
        Node TEM=  teprary.pop();
              data.push(TEM);
     }
         return true;
       }
else
    return false;
    }  }

    public Node dequeue() {
        return data.pop();
    }

    @Override
    public String toString() {



        return "Queue{" + data.toString() +'}';
    }
}
