package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SorterTest {

    @Test
    void testSortDescending() {
        int[] array = {5, 3, 8, 1, 7};
        int[] expected = {5, 8, 7, 3, 1};

        Sorter.sortDescending(array, 1, 4);
        assertThat(array).containsExactly(expected);
    }
}
