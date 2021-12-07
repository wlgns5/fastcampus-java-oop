package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("JavaSort Test")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        // Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        // When
        List<Integer> actual = javaSort.sort(Arrays.asList(3, 2, 4, 5, 1));

        // Then
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), actual);
    }
}