package stack.and.queue.stack;

public class  Node {
   private final String value;

private Node  next;



   public Node(String value) {
      this.value = value;

   }


   public void setNext(Node  next) {
      this.next = next;
   }

   public String getValue() {
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
