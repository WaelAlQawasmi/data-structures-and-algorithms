/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sum.odd.b.tree;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {


        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(100);
        binarySearchTree.insert(200);
        binarySearchTree.insert(7);
        binarySearchTree.insert(2);
        binarySearchTree.insert(11);
        binarySearchTree.insert(3);
        System.out.println(binarySearchTree.sumOdd(binarySearchTree));
    }
}
