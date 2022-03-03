import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {





        @Test
        @DisplayName("inset Test , head , multiple nodes and print collection item")
        void insertTEST(){
            linkedList classUnderTest = new linkedList();
            classUnderTest.insert("a");
            assertEquals("a",  classUnderTest.head.value); // head test
            assertEquals("\"{a}->NULL\"",  classUnderTest.AllItems()); //insert test
            classUnderTest.insert("C");
            classUnderTest.insert("D");
            assertEquals("\"{D}->{C}->{a}->NULL\"",  classUnderTest.AllItems());// multi Node test
        }
    @DisplayName("empty Instantiate")
    @Test void emptyInstantiate  (){
        linkedList classUnderTest = new linkedList();

        assertEquals("\"\"", classUnderTest.AllItems());
    }
    @DisplayName("Is Inculde Test")
        @Test void IncludeTest() {

            linkedList  <String>  classUnderTest = new linkedList();
            classUnderTest.insert("a");

           assertEquals( true ,  classUnderTest.includes("a"));
        assertEquals( false ,  classUnderTest.includes("b"));

        }
//
//
}
