package stack.queue.pseudo;

public class stack {
    private  Node  top;
private  int length=0;


    public stack() {
        this.top = null;
    }



    public Node   push(Node  newStackNode){
        if (peek()==null){
            ++ this.length;
            newStackNode.setNext(null);
            this.top=newStackNode;
            return newStackNode;
        }
        else {
            newStackNode.setNext(top);
            top=newStackNode;
            ++ this.length;
            return  newStackNode;


        }
    }


    public Node pop(){
        if (peek()!=null){
            this.length--;
            Node PT=this.top;// the poped Node
            this.top=this.top.getNext();

                return  PT;

        }
        else {
            System.out.println("it is empty");
            return null;
        }

    }



    public String peek()
    {
        if (top!=null){
            return this.top.getValue();
        }
        else
            return null;
    }

    @Override
    public String toString() {
        Node pointer= this.top;
        String OUTPUT="";
        while (pointer!=null){
            OUTPUT+=pointer.getValue()+" <=";
            pointer=pointer.getNext();
        }
        return
                OUTPUT +"null";
    }
}
