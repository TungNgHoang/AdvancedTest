package org.example;

import java.util.HashMap;
import java.util.Map;

public class Algorithm {
    public static int[] bubbleSort(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Input array cannot be null");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int target) {
        if (arr == null) throw new IllegalArgumentException("Input array cannot be null");
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Target không tồn tại
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static Map<String, Integer> countWordOccurrences(String text) {
        if (text == null ) throw new IllegalArgumentException("Text cannot be null");
        if (text.isEmpty()) return new HashMap<>(); // Return an empty map for empty string

        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-z]", ""); // Bỏ ký tự đặc biệt
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

}
