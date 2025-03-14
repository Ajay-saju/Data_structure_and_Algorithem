import java.util.Arrays;

class Rotate_Array {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        System.out.println(Arrays.toString(nums));
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));


    }

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;
        reverse(0, nums.length, nums);
        reverse(0, k,nums);
        reverse(k + 1, nums.length,nums);

    }

    private static void reverse(int m, int length, int[] nums) {

        for (int i = m; i < length; i++) {
            int temp = nums[i];
            nums[i] = nums[length - 1];
            nums[length - 1] = temp;
            length--;
        }
    }
}