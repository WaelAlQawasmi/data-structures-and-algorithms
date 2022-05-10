

import QuickSort.app;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test void testONe() {
        int[] arrBefor = { 10, 7, 8, 9, 1, 5 };
        app.QuickSort(arrBefor, 0, arrBefor.length - 1);
        int[] arrAfter = { 1, 5, 7, 8, 9, 10 };
       assertArrayEquals(arrBefor, arrAfter);

    }

    @Test void testtwo() {
        int[] arrBefor = {20,18,12,8,5,-2 };
        app.QuickSort(arrBefor, 0, arrBefor.length - 1);
        int[] arrAfter = { -2,5,8,12,18,20 };
        assertArrayEquals(arrBefor, arrAfter);

    }


    @Test void testthree() {
        int[] arrBefor = {2,3,5,7,13,11};
        app.QuickSort(arrBefor, 0, arrBefor.length - 1);
        int[] arrAfter = { 2,3,5,7,11,13};
        assertArrayEquals(arrBefor, arrAfter);

    }

}
