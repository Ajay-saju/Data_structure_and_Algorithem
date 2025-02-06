import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] A = { 3, 10, 6, 8, 15, 2, 12, 18, 17 };

        mergeSort(A, 0, A.length-1);
        System.out.println(Arrays.toString(A));
    }

    private static void mergeSort(int[] a, int l, int r) {

        if (l == r)
            return;
        int mid = (l + r) / 2;
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
         merge(a, l, mid, r);
    }

    private static void merge(int[] a, int l, int mid, int r) {

        int leftArrLength = mid - l + 1;
        int rightArrLength = r - mid;

        int[] leftArr = new int[leftArrLength];
        int[] rightArr = new int[rightArrLength];

        // add elements to the array

        for (int i = 0; i < leftArrLength; i++) {

            leftArr[i] = a[l + i];

        }

        for(int i = 0; i< rightArrLength; i++){
            rightArr[i] = a[mid + 1 + i];
        }

        // compaire and merge 2 sorted array 

       int k = l;
       int i = 0;
       int j = 0;

       while ( i < leftArrLength && j < rightArrLength ){

        if( leftArr[i] <= rightArr[j]){
            a[k] = leftArr[i];
            i++;
        }else{
            a[k] = rightArr[j];
            j++;
        }
        k++;
       }

       // copy remaining elements 

       while ( i < leftArrLength){
        a[k] = leftArr[i];
        i++;
        k++;
       }

       while ( j< rightArrLength){
        a[k] = rightArr[j];
        j++;
        k++;
       }

    }

}
