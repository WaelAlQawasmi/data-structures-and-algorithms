package stack.and.queue.stack;

public class stack {
    private  Node  top;



    public stack() {
        this.top = null;
    }


    public boolean isEmpty(){
        if(this.top==null){
            return true;
        }
        else {
            return  false;
        }
    }



    public Node   push(Node  newStackNode){
if (isEmpty()){
    this.top=newStackNode;
return newStackNode;
}
else {
   newStackNode.setNext(top);
   top=newStackNode;
   return  newStackNode;

}
    }


    public String pop(){
        if (!isEmpty()){

this.top=this.top.getNext();
if(this.top!= null){
return  this.top.getValue();}
else {
    return null;
}
        }
        else {
          System.out.println("it is empty");
            return null;
        }

    }




    public String peek()
    {
        if (!isEmpty()){
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
            OUTPUT+=pointer.getValue()+" =>";
            pointer=pointer.getNext();
        }
        return "stack{" +
                 OUTPUT +"null"+
                '}';
    }
}
