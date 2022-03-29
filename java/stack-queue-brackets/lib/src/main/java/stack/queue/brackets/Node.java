package stack.queue.brackets;


public class  Node {
    private final char value;

    private Node  next;



    public Node(char value) {
        this.value = value;

    }


    public void setNext(Node  next) {
        this.next = next;
    }

    public char getValue() {
        return value;
    }



    public Node  getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "stackNode{" +
                "value='" + value + '\'' +
                '\'' +
                '}';
    }
}
