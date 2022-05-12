
package hashtable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {


        Hashtable<String, String> hashtable = new Hashtable<>();


    @Test void setTest(){

        hashtable.set("key1", "Value1");
System.out.println(hashtable.isEmpty());

     assertEquals(hashtable.isEmpty(),false);

    }

    @Test void getTest(){

        hashtable.set("key1", "Value1");

        hashtable.set("key2", "Value2");

        assertEquals("Value1", hashtable.get("key1"));
    }


    @Test void errorKey(){

        hashtable.set("key1", "Value1");

        hashtable.set("key2", "Value2");

        assertEquals(null, hashtable.get("key3"));
    }

    @Test void AllKyes(){

        hashtable.set("key1", "Value1");

        hashtable.set("key2", "Value2");

        String[] keysTest = {"key1","key2"};
        assertArrayEquals(keysTest, hashtable.keys().toArray(new String[0]));
    }

    @Test void handleCollision (){

        hashtable.set("key1", "Value1");
        hashtable.set("key2", "Value2");
        assertNotEquals(hashtable.hash("key1"), hashtable.hash("key2"));
    }

    @Test void hashing(){

        hashtable.set("key1", "Value1");
        hashtable.set("key2", "Value2");

        assertEquals("Value1", hashtable.get("key1"));
        assertEquals("Value2", hashtable.get("key2"));

    }
    @Test void in_range(){

boolean testValue=false;
        hashtable.set("key1", "Value1");
        hashtable.set("key2", "Value2");
        if(hashtable.hash("key1")>=0&&hashtable.hash("key1") <= 9){
            testValue=true;
        }

        assertTrue(testValue);


    }


}