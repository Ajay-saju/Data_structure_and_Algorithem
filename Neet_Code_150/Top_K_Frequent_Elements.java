package Neet_Code_150;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 2, 2, 3,5,5,5,5,5 };
        int[] ans = topKFrequent(a, 2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        if (nums.length == k) {
            return nums;
        }

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int key : nums) {

            myMap.put(key, myMap.getOrDefault(key, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> value : myMap.entrySet()) {

            minHeap.offer(value);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] topKElements = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            topKElements[i] = minHeap.poll().getKey();
        }
        return topKElements;
    }

}
