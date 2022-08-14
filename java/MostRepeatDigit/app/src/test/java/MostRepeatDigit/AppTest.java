/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MostRepeatDigit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void test1() {
        int []test={25,58,78,25,55,22};
        int []exp={5};
        assertArrayEquals(App.solution(test),exp);

    }


    @Test void test2() {
        int []test={25,58,28,25,55,22};
        int []exp={5,2};
        assertArrayEquals(App.solution(test),exp);

    }
}