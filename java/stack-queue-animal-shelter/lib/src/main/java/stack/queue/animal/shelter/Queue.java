package stack.queue.animal.shelter;


public class Queue {
    private static final int QueueSize = 10;
    private animal front;
    private animal back;
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


    public void enqueue(animal newNode) {
        if (isEmpty()) {
            front = newNode;
            back = newNode;
            size++;

        }
        else {
            if (size < QueueSize) {
                back.setNext(newNode);

                back = newNode;
                size++;
            }
        }

    }



    public String peek() {
        if (isEmpty()) {
            return null;
        } else{
            return front.getName();
        }
    }


    public String dequeue() {
        animal frontTemp;
        if (isEmpty()) {
            return null;
            // throw new NoSuchElementException("The queue is empty");

        } else {
            frontTemp = front;

            front = this.front.getNext(); // removes the first node
            System.out.println(front);
        }

        return frontTemp.getName();
    }

    @Override
    public String toString() {

        animal pointer= this.front;
        String OUTPUT="";
        while (pointer!=null){

            OUTPUT+=pointer.getName()+" =>";
            pointer=pointer.getNext();
        }

        return "Queue{" + OUTPUT +'}';
    }
}
