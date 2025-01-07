package org.testExample;

import org.example.Algorithm;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmTest {
    // Unit test cho hàm bubbleSort
    @Test
    public void testBubbleSort_withValidInput() {
        int[] input = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        assertArrayEquals(expected, Algorithm.bubbleSort(input));
    }

    @Test
    public void testBubbleSort_withEmptyArray() {
        int[] input = {};
        assertArrayEquals(input, Algorithm.bubbleSort(input));
    }

    @Test
    public void testBubbleSort_withNullInput() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.bubbleSort(null));
    }

    @Test
    public void testBubbleSort_withNegativeNumbers() {
        int[] input = {-3, -1, -2, 0, -4};
        int[] expected = {-4, -3, -2, -1, 0};
        assertArrayEquals(expected, Algorithm.bubbleSort(input));
    }

    // Unit test cho hàm binarySearch
    @Test
    void testBinarySearch_Found() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, Algorithm.binarySearch(arr, 3)); // Giá trị tồn tại
    }

    @Test
    void testBinarySearch_NotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, Algorithm.binarySearch(arr, 6)); // Giá trị không tồn tại
    }

    @Test
    void testBinarySearch_EmptyArray() {
        int[] arr = {};
        assertEquals(-1, Algorithm.binarySearch(arr, 3)); // Mảng rỗng
    }

    @Test
    void testBinarySearch_NullArray() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.binarySearch(null, 3)); // Mảng null
    }

    @Test
    void testBinarySearch_SingleElement() {
        int[] arr = {3};
        assertEquals(0, Algorithm.binarySearch(arr, 3)); // Mảng 1 phần tử, tìm thấy
        assertEquals(-1, Algorithm.binarySearch(arr, 4)); // Mảng 1 phần tử, không tìm thấy
    }
    @Test
    void testBinarySearch_TargetSmallerThanMid() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, Algorithm.binarySearch(arr, 1)); // Giá trị nhỏ hơn mid, đi vào nhánh `else right = mid - 1`
        assertEquals(1, Algorithm.binarySearch(arr, 2)); // Giá trị nhỏ hơn mid, đi vào nhánh `else right = mid - 1`
    }


    // Unit test cho hàm factorial
    @Test
    void testFactorial_Zero() {
        assertEquals(1, Algorithm.factorial(0)); // Trường hợp cơ sở n = 0
    }

    @Test
    void testFactorial_One() {
        assertEquals(1, Algorithm.factorial(1)); // Trường hợp n = 1
    }

    @Test
    void testFactorial_Positive() {
        assertEquals(120, Algorithm.factorial(5)); // Trường hợp n > 1
    }

    @Test
    void testFactorial_Negative() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.factorial(-1)); // Trường hợp n < 0
    }

    // Unit test cho hàm countWordOccurrences
    @Test
    void testCountWordOccurrences_EmptyString() {
        Map<String, Integer> result = Algorithm.countWordOccurrences("");
        assertTrue(result.isEmpty()); // Chuỗi rỗng
    }

    @Test
    void testCountWordOccurrences_NullString() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.countWordOccurrences(null)); // Chuỗi null
    }

    @Test
    void testCountWordOccurrences_SpecialCharacters() {
        Map<String, Integer> result = Algorithm.countWordOccurrences("Onni-chan, baka! Baka!");
        assertEquals(1, result.get("onnichan")); // Bỏ ký tự đặc biệt và đếm đúng
        assertEquals(2, result.get("baka"));
    }
}
