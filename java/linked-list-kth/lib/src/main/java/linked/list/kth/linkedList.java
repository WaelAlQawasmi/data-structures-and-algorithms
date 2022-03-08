package linked.list.kth;

public class linkedList<T> {
    Node head;
    private int size;
    public linkedList() {
        this.head = null;
    }

    public void add(T value){
        Node newNode= new Node(value);
       newNode.next=head;
       head=newNode;
       this.size++;
    }

    public Object kthFromEnd(int k){
        int index=0;
        try {
            int opsetIndex=this.size-k-1;

            Node pinter= head;

            while (opsetIndex!=index){
                pinter=pinter.next;
                index++;
            }

            System.out.println("Index="+k+" value====>"
                    +pinter.value);

            //
            return  pinter.value;


        }
        catch (Exception e){

            return "error Input" ;
        }



    }

    @Override
    public String toString() {
        Node pinter= head;
        while (pinter!=null){

            System.out.print(pinter.value+" =>");
            pinter=pinter.next;
        }
        return "null";
    }
}
