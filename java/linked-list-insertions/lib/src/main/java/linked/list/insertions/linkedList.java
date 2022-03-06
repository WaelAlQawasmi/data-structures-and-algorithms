package linked.list.insertions;

public class linkedList <T> {
Node head ;  // to decelerate  variable can have object from Node in other word  can save object on it

    public linkedList() {
        this.head = null; // the first time of head null
    }

     public  void addFirst(T val){
        Node newNode= new Node(val); // create New object and stor the value in constractor
    newNode.next=this.head; // two of this varible jave a data type can save object of Node Class
   this.head=newNode;// the head will point to new node and in prives line the newNode eill point to the next

     }



    public  void insertAfter(T val,T beforvalue){
        Node pointer = head;
        Node NewNode=new Node(beforvalue);
        while (pointer!=null){

            if(pointer.value==val){

                NewNode.next=pointer.next;
                pointer.next=NewNode;
                break;
            }
    pointer=pointer.next;
                          }

        }




    public  void append(T val){
        Node pointer = this.head;
        Node NewNode=new Node(val);
        if(pointer==null){
System.out.println("ko");
            this.head= NewNode;
            NewNode.next=null;
        }

        while (pointer!=null){

            if(pointer.next==null){

                NewNode.next=null;
                pointer.next=NewNode;
                break;
            }
            pointer=pointer.next;
        }


    }

    public  void insertBefor(T val,T beforvalue){
        Node pointer = head;
        Node NewNode=new Node(beforvalue);
        while (pointer!=null){
            if(this.head.value==val)
            {  NewNode.next=head;
                this.head=NewNode;

            }
                if(pointer.next!=null){
            if(pointer.next.value==val){

                NewNode.next=pointer.next;
                pointer.next=NewNode;
                break;
            }
}
            pointer=pointer.next;
        }

    }

    public  void printAll(){
        try {
            Node pointer = this.head;

            while (pointer!=null){

                System.out.print(pointer.value+"=>");
                if(pointer.next==null){
                    System.out.print("null");
                }
                pointer=pointer.next;

            }

        }
        catch ( Exception e){
            System.out.println("ERROE LINKED LIST INSTALLTAION ");
        }




    }


    public  String gitNode(){
        Node pointer = this.head;
        String retern="";
        while (pointer!=null){
            retern=retern+pointer.value+"=>";

            if(pointer.next==null){
                retern=retern+"null";

            }
            pointer=pointer.next;

        }
return  retern;

    }



}
