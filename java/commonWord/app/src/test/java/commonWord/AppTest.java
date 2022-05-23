/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package commonWord;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void test1() {
        App classUnderTest = new App();
        assertEquals(classUnderTest.commonWord("No. Try not. Do or do not. There is no try."), "no");
    }


    @Test void test2() {
        App classUnderTest = new App();
        assertEquals(classUnderTest.commonWord("In a galaxy far far away"), "far");
    }


    @Test void test3() {
        App classUnderTest = new App();
        assertEquals(classUnderTest.commonWord("Taco cat ate a taco"), "taco");
    }
}