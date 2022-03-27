package maxstake;

public class maxStack {


   private stack ActalStak= new stack();
  private   stack MaxStak= new stack();



    public void    push(Node  newStackNode){
        if (ActalStak.isEmpty()){

          ActalStak.push(newStackNode);
          MaxStak.push(newStackNode);
        }
        else {
           if(newStackNode.getValue()>MaxStak.peek()){
               ActalStak.push(newStackNode);
               MaxStak.push(newStackNode);
           }
           else {
               ActalStak.push(newStackNode);
               Node peek=new Node(MaxStak.peek());
               MaxStak.push(peek);
           }

        }
    }


    public int getMax(){
        if(isEmpty()){
            System.out.println("NO data");
            return 0;
        }
        return ActalStak.peek();
    }


    public int pop(){
        if (!isEmpty()){


            MaxStak.pop();
            return ActalStak.pop();
        }
        else {
            System.out.println("it is empty");
            return 0;
        }

    }


    public boolean isEmpty(){
        if(ActalStak.isEmpty()==true){
            return true;
        }
        else {
            return  false;
        }
    }

        public int peek()
    {
        if (!isEmpty()){
            return ActalStak.peek();
        }
        else
            return 0;
    }

    @Override
    public String toString() {

        return ActalStak.toString();
    }
}
