
import java.util.Arrays;

public class Problem3 {

    // Merge 2 sorted array
    public static void main(String[] args) {
        int[] A = { 2, 5, 4, 8, 11, 13, 10, 15, 21 };

        mergeTwoSortedArray(A);
    }

    private static void mergeTwoSortedArray(int[] a) {

        int n = a.length;

        // count odd and even elements
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(oddCount + "  " + evenCount);

        // create separate odd and even arrays

        int[] oddArr = new int[oddCount];
        int[] evenArr = new int[evenCount];

        // add odd and even elements to the new arrays

        int oddIdx = 0;
        int evenIdx = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evenArr[evenIdx] = a[i];
                evenIdx++;
            } else {

                oddArr[oddIdx] = a[i];
                oddIdx++;

            }
        }

        // create pointer for comparing this elements

        oddIdx = 0;
        evenIdx = 0;
        int idx = 0;

        int[] ans = new int[n];

        while (oddIdx < oddArr.length && evenIdx < evenArr.length) {

            if (evenArr[evenIdx] < oddArr[oddIdx]) {
                ans[idx] = evenArr[evenIdx];
                idx++;
                evenIdx++;
            } else {
                ans[idx] = oddArr[oddIdx];
                idx++;
                oddIdx++;
            }
        }

        // copy remaininig elements 

        while( oddIdx < oddArr.length){
            ans[idx] = oddArr[oddIdx];
            oddIdx++;
            idx++;
        }

        while(evenIdx > evenArr.length){
            ans[idx] = evenArr[evenIdx];
            evenIdx++;
            idx++;
        }
        System.out.println(Arrays.toString(ans));

    }
}
