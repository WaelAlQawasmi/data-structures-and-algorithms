/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.kth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void k_is_greater_than_the_length() {
        linkedList<Integer> Nodes = new linkedList<>();
        Nodes.add(2);
        Nodes.add(8);
        Nodes.add(3);
        Nodes.add(1);
        assertEquals("error Input",Nodes.kthFromEnd(6));

    }

    @Test void k_is_same_than_the_length() {
        linkedList<Integer> Nodes = new linkedList<>();
        Nodes.add(2);
        Nodes.add(8);
        Nodes.add(3);
        Nodes.add(1);
        assertEquals("error Input",Nodes.kthFromEnd(4));

    }

    @Test void k_is_less_than_the_length() {
        linkedList<Integer> Nodes = new linkedList<>();
        Nodes.add(2);
        Nodes.add(8);
        Nodes.add(3);
        Nodes.add(1);
        assertEquals(3,Nodes.kthFromEnd(2));

    }

    @Test void k_is_Negative() {
        linkedList<Integer> Nodes = new linkedList<>();
        Nodes.add(2);
        Nodes.add(8);
        Nodes.add(3);
        Nodes.add(1);
        assertEquals("error Input",Nodes.kthFromEnd(-2));

    }

    @Test void sizeOne() {
        linkedList<Integer> Nodes = new linkedList<>();
        Nodes.add(2);

        assertEquals(2,Nodes.kthFromEnd(0));

    }

    @Test void middleLinked() {
        linkedList<Integer> Nodes = new linkedList<>();
        Nodes.add(2);
        Nodes.add(0);
        Nodes.add(1);
        assertEquals(0,Nodes.kthFromEnd(1));

    }

}