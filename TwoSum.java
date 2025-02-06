
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

// ****  Approch  ********* 

// B.F --> iterate trough the array and compaire all posible combinations 
// TC - o(n^2)
// Use binery search 
// TC --> o(nlog(n))
// use hashMap  tc --> o(n) sc--> o(n) 

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;

        int[] ans = solution(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solution(int[] nums, int target) {

        int[] ans = new int[2];
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int k = target - nums[i];

            if (myMap.containsKey(k)) {
                ans[0] = myMap.get(k);
                ans[1] = i;
                return ans;
            } else {
                myMap.put(nums[i], i);
            }
        }
        return ans;
    }

}
