/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue.animal.shelter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void enqueue() {
        AnimalShelter shalter= new AnimalShelter();
        animal ca1=new animal("cat");
        animal ca2=new cat("cat");

        animal d2 =new dog("dog");
        animal d3 =new dog("dog");

        shalter.enqueue(ca1);
        shalter.enqueue(ca2);

        shalter.enqueue(d2);
        shalter.enqueue(d3);

        assertEquals(shalter.toString(),"AnimalShelter{cate=Queue{cat =>cat =>}, doge=Queue{dog =>dog =>}}");
    }

    @Test void DEqueueCat() {
        AnimalShelter shalter= new AnimalShelter();
        animal ca1=new animal("cat");
        shalter.enqueue(ca1);
        assertEquals(shalter.dequeue("cat"),"cat");//test1

    }


    @Test void DEqueueDog() {
        AnimalShelter shalter= new AnimalShelter();
        animal d3 =new dog("dog");
        shalter.enqueue(d3);
        assertEquals(shalter.dequeue("dog"),"dog");//test2


    }


    @Test void DEqueueNull() {
        AnimalShelter shalter= new AnimalShelter();

        assertEquals(shalter.dequeue("qqqqq"),null);//test3
    }

}
