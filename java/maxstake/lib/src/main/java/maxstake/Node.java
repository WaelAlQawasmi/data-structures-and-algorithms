package maxstake;

public class Node {


        private final int value;

        private Node  next;



        public Node(int value) {
            this.value = value;

        }


        public void setNext(Node  next) {
            this.next = next;
        }

        public int getValue() {
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
