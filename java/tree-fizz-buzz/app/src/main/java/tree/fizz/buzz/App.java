/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.fizz.buzz;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {


Node newNode= new Node(3);
        kArrTree tree = new kArrTree(newNode);
        tree.getRoot().addChild(5);
        tree.getRoot().addChild(15);
        // Add child node [2,1,6] in node (8)
tree.getRoot().getChild().get(0).addChild(8);
tree.print();
System.out.println(".......");
        System.out.println(   FizzBuzz(tree).print());
    }

    public static kArrTree FizzBuzz(kArrTree KT)
    {
        Node node=KT.getRoot();
        ExicFizzBuzz(node);
        return KT;
    }


    public static void ExicFizzBuzz(Node node)
    {

        if (node == null)
        {
            return;
        }
        int i = 0;
        Node temp = null;
        int o = (Integer) node.getValue();
        int three=o%3;
        int five=o%5;

        if(three==0&&five!=0){
            node.setValue("Fizz");
        }
        else if(three!=0&&five==0){
            node.setValue("Buzz");
        }
        else if(three==0&&five==0){
            node.setValue("FizzBuzz");
        }
        else {
            node.setValue(node.getValue().toString());
        }
        System.out.print(node.getValue()+" ");

        while (i < node.getChild().size())
        {
            temp = (Node) node.getChild().get(i);
            ExicFizzBuzz(temp);
            i++;
        }
    }


}
