package tree.breadth.first;

public class  Node<T> {
    private final T value;
    private String data;

    private BTNode left;
    private BTNode right;
    private Node  next;



    public Node(T value) {
        this.value = value;

    }


    public void setNext(Node  next) {
        this.next = next;
    }

    public T getValue() {
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
