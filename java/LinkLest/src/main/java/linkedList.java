public class linkedList <T> {
    Node head;

    public linkedList() {
        this.head =  null;
    }


      public void insert (T value){
         try {
             Node addedNode = new Node(value);
             addedNode.next = this.head;
             this.head = addedNode;
         }
         catch (Exception e){
             System.out.println(" insert error");
         }

    }


    public boolean includes(T value){
        Node pointer = this.head;
        while(pointer != null)
        {
            if(pointer.value== value)
            return true;
            pointer = pointer.next;
        }
        return false;
    }

    public String AllItems(){
        Node pointer = this.head;
        String Ret="\"";
        while(pointer != null)
        {
            Ret=Ret+"{"+pointer.value+"}->";

            if(pointer.next==null){
                Ret=Ret+"NULL";
            }
            pointer = pointer.next;
        }
        return Ret+"\"";
    }
}
