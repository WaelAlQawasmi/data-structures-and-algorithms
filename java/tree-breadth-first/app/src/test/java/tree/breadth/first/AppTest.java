/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.breadth.first;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void test1() {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new BTNode("2"));

        binaryTree.getRoot().setLeft(new BTNode("7"));

        binaryTree.getRoot().setRight(new BTNode("5"));

        binaryTree.getRoot().getLeft().setLeft(new BTNode("2"));
        binaryTree.getRoot().getLeft().setRight(new BTNode("6"));
//System.out.println("0000000000000");
        binaryTree.getRoot().getRight().setRight(new BTNode("9"));
        binaryTree.getRoot().getRight().getRight().setLeft(new BTNode("4"));

        binaryTree.getRoot().getLeft().getRight().setRight(new BTNode("11"));
        binaryTree.getRoot().getLeft().getRight().setLeft(new BTNode("5"));


        Object []arrTest= {"2", "7", "5", "2", "6", "9", "5", "11", "4"};

assertArrayEquals(App.breadth_first(binaryTree).toArray(),arrTest);
    }
}