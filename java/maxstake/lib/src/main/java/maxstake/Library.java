/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package maxstake;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }


    public static void main(String[] args) {
Node one=new Node(10);
        Node one2=new Node(10);
        Node one4=new Node(100);

        Node one5=new Node(100);
        Node one3=new Node(20);



        maxStack stack=new maxStack();
        stack.push(one);
        stack.push(one2);
        stack.push(one3);
        stack.push(one4);
        stack.push(one5);
        System.out.println(stack.getMax());

    }

}

