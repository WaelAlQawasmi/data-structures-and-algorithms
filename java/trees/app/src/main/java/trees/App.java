/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;



public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();

       binaryTree.setRoot(new BTNode("root"));
//
        binaryTree.getRoot().setLeft(new BTNode("2"));
//
        binaryTree.getRoot().setRight(new BTNode("3"));
        binaryTree.getRoot().getLeft().setLeft(new BTNode("a"));
        binaryTree.getRoot().getLeft().setRight(new BTNode("b"));
        binaryTree.BFS(binaryTree.getRoot());
//
//        binaryTree.inOrder( binaryTree.getRoot());
//
//        System.out.println("......................89");
//
//        binaryTree.preOrder( binaryTree.getRoot());
//        System.out.println("......................");
//        for (String el:binaryTree.postOrder( binaryTree.getRoot())
//             ) {
//            System.out.println(el);
//        }


//        BinarySearchTree binarySearchTree=new BinarySearchTree();
//        binarySearchTree.insert(100);
//        binarySearchTree.insert(200);
//        binarySearchTree.insert(7);
//        binarySearchTree.insert(2);
//        binarySearchTree.insert(11);
//        binarySearchTree.insert(3);
//       System.out.println(binarySearchTree.sumOdd(binarySearchTree));
     //System.out.println( binarySearchTree.Contains(270));

    }
}
