package linked.list.zip;

import static java.math.BigInteger.ONE;

public class linkedList<T> {
    Node head;
public  int size;
    public linkedList() {
        this.head = null;
    }

    public void add(T v){
        Node newNode=new Node(v);
        newNode.next=head;
        head=newNode;
        this.size++;

    }


    public  Node Index(int index){
        int  counter=0;
        Node pointer =this.head;

        while (pointer!=null){
            counter++;
            if(counter==index){
return pointer;

            }
            pointer=pointer.next;
        }
return null;
    }



    public  void insertAfter(T val,int aftervalue){
        int  counter=0;
        Node pointer = head;
        Node NewNode=new Node(val);
        while (pointer!=null){
counter++;
            if(counter==aftervalue){

                NewNode.next=pointer.next;
                pointer.next=NewNode;
                break;
            }
            pointer=pointer.next;
        }

    }



    public   void reverse(){
        int length=this.size;

        int counter=0;
        while (length!=0) {

            counter++;

            T temStart  = (T) Index(counter).value;
            T temEnd  = (T) Index(length).value;

            if(length==size/2){
                break;
            }
           Index(counter).value=temEnd;
            Index(length).value=temStart;

            length--;
        }


    }


    public   void printAll(){

        Node pointer=head;
        while (pointer!=null){

            System.out.print(pointer.value+"=>");

            pointer=pointer.next;


        }
        System.out.println("null");
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

    public static   linkedList zip(linkedList ONE,linkedList TWO){
        int length=ONE.size+TWO.size;
        int counter=0;
        while (length!=0){
            length--;
            counter++;
            if(TWO.Index(counter)==null){
                System.out.println("BREAK"+counter);

                               break;
            }
            if(TWO.size>ONE.size &&counter> ONE.size){
                ONE.append(TWO.Index(counter).value);
            }
            else {
                ONE.insertAfter(TWO.Index(counter).value,counter*2-1);
            }
          //  System.out.println(counter);



      }

//ONE.printAll();

return  ONE;
}


    @Override
    public String toString() {
String OUTPUT="";
        Node pointer=head;
        while (pointer!=null){

            System.out.print(pointer.value+"=>");
            OUTPUT=OUTPUT+pointer.value+"=>";
            pointer=pointer.next;


        }
        OUTPUT=OUTPUT+"null";
        return OUTPUT;
    }
}
