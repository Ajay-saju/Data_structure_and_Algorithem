import java.util.Arrays;

class Problem1{

    // sort the array using frequncy array 
    public static void main(String[] args) {

        int[ ] a = {6,3,4,2,7,2,1};

        // create a frequncy array 
       
        int[] freq = new int[10 ];
        
        
        for(int i = 0; i< a.length   ; i++){

            int val = a[i];

            freq[val ] = freq[val] + 1;
            
        }

        int []ans =new  int [a.length];
         int idx = 0;
       for(int i = 0 ; i< 10; i++){

        for( int count  = 1 ; count <= freq[i]; count ++){
            ans[idx] = i;
            idx++;
        }
       }
       System.out.println(Arrays.toString(ans));
        
    }
}