
// Given 2 arrays A[n] B[m] calculate the number of pair i,j such that A[i] > B[j] 
// Eg - A[3] = {7,0,3};
//      B[3] = {2,0,6};
// ans =  (7,2), (7,0), (7,6), (3,0), (3,2) total 5 

// B.F = use 2 loops 

import java.util.Arrays;

public class Problem4 {

    public static void main(String[] args) {
        int A[] = { 2,3,4,8};
        int B[] = { 1,5,7,6 };

        countPairs(A, B);
    }

    private static void countPairs(int[] A, int[] B) {

        // sort the 2 arrays
        Arrays.sort(A);
        Arrays.sort(B);

        // merge these 2 sorted arrays .
        merge(A, B);

    }

    private static void merge(int[] a, int[] b) {

        int[] ansArr = new int[a.length + b.length];

        int idx = 0;
        int p1 = 0;
        int p2 = 0;
        int count = 0;

        while (p1 < a.length && p2 < b.length) {

            if (a[p1] > b[p2]) {
                ansArr[idx] = b[p2];
                p2++;
                count = count + (a.length-p1); 
            } else {
                ansArr[idx] = a[p1];
                p1++;
            }
            idx++;

        }System.out.println(count);

    }
}
