package stack.queue.animal.shelter;


public class  animal {
    private final String name;

    private animal next;


    public animal(String value) {
        this.name = value;

    }


    public void setNext(animal next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }



    public animal  getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "stackNode{" +
                "value='" + name + '\'' +
                '\'' +
                '}';
    }
}