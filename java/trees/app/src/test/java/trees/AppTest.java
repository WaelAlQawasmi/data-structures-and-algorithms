/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void instantiate_an_empty_tree() {
        BinaryTree binaryTree=new BinaryTree();
        assertEquals(binaryTree.getRoot(),null);

    }

    @Test void instantiate_tree_single_root() {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.setRoot(new BTNode("W"));
        assertEquals(binaryTree.getRoot().getData(),"W");

    }

    @Test void BinarySearchChildrin () {

        BinarySearchTree binarySearchTree=new BinarySearchTree();

        assertEquals( binarySearchTree.insert(100),"root");
        assertEquals( binarySearchTree.insert(70),"left");
        assertEquals( binarySearchTree.insert(200),"right");

    }


    @Test void postorderTraversal () {

        BinaryTree binaryTree=new BinaryTree();

        binaryTree.setRoot(new BTNode("1"));

        binaryTree.getRoot().setLeft(new BTNode("a"));

        binaryTree.getRoot().setRight(new BTNode("e"));

        String[]arr={"a","e","1"};
        assertArrayEquals( binaryTree.postOrder( binaryTree.getRoot()),arr );

    }


    @Test void preorderTraversal () {

        BinaryTree binaryTree=new BinaryTree();

        binaryTree.setRoot(new BTNode("9"));

        binaryTree.getRoot().setLeft(new BTNode("a"));

        binaryTree.getRoot().setRight(new BTNode("e"));


        String[]arr={"9","a","e"};
        assertArrayEquals(  binaryTree.preOrder( binaryTree.getRoot()),arr );

    }

    @Test void InorderTraversal () {

        BinaryTree binaryTree=new BinaryTree();

        binaryTree.setRoot(new BTNode("W"));

        binaryTree.getRoot().setLeft(new BTNode("a"));

        binaryTree.getRoot().setRight(new BTNode("e"));

        binaryTree.getRoot().getLeft().setLeft(new BTNode("X"));
        String[]arr={"X","a","W","e"};
        assertArrayEquals(  binaryTree.inOrder( binaryTree.getRoot()),arr );

    }

    @Test void containsTest () {


        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(100);
        binarySearchTree.insert(200);
        binarySearchTree.insert(70);
        assertEquals(  binarySearchTree.Contains(270),false );
        assertEquals(  binarySearchTree.Contains(200),true );

    }
}
