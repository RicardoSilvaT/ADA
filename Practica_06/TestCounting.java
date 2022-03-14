import org.junit.Test;

public class TestCounting {

    @Test
    public void sort() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        CountingSort.sort(unsorted);
        assertArrayEquals("Counting sort is not working", sorted, unsorted);
    }
}