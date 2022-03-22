package codechallenges.insertsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

    @Test
    void test_insertionSort() {
        InsertSort sut = new InsertSort();
        int[] numArr = new int[]{8,4,23,42,16,15};
        sut.insertionSort(numArr);
        for (int num: numArr
             ) {
            System.out.print(num + ",");
        }
        assertTrue(true, "Yo something is wrong with insertion Sort");
    }
}