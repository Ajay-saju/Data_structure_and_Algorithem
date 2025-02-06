import java.util.Arrays;

public class Problem2 {

    // count sort 

    public static void main(String[] args) {
        int[] A = { -2, 3, 8, 3, -2, 3 };

        System.out.println(Arrays.toString(countSort(A)));
    }

    private static int [] countSort(int[] a) {

        int[] ans = new int [a.length];
        
        // find range 
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i =0; i< a.length; i++){
             if( a[i] < smallest){
                smallest = a[i];
             }else if( a[i] > largest){
                largest = a[i];
             }
        }
        
        // frequency array 
        int range = largest - smallest +1;
        int[] freq = new int [range];
        

        for(int i = 0; i< a.length; i++){
              
            int idx = a[i] - smallest;
            freq[idx] = freq[idx] + 1;
        }
        // System.out.println(Arrays.toString(freq));

        /// create sorted array 
         int index = 0;
        for( int d = 0; d< range; d++){
           
            int element = d+smallest;
            for( int j = 1; j<= freq[d]; j++){
                ans[index] = element;
                index++;
            }
        }
        return ans;
       
    }
}
