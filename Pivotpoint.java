import java.util.Arrays;

public class Pivotpoint {
    public static void main(String[] args) {
        System.out.println(pivotInteger(18));
    }
    
    public static int pivotInteger(int n) {
        int ans = 0;

        int []pf = new int[n];
        pf[0] = 1;
       
        int i = 1;
        int count = 2;
        while( i < n){
           pf[i] = pf[i-1] + count;
           i++;
           count++;
        }
        int []pf2 = new int[n];
       
        pf2[0] = n;
        int counter = 7;
        for(int j = 1; j< n; j++){
           pf2[j] = pf2[j-1]+counter;
           counter--;
        }
        System.out.println(Arrays.toString(pf));
        System.out.println(Arrays.toString(pf2));
      for(int k = 1; k< n; k++){
    //    int leftsum = k;
    //    int rightIdx=  (n-1)-k;
    int rightsum = pf[n-1] - pf[k-1];
       if(pf[k] == rightsum ){
           ans = k+1;
       }
      }

    return  ans != 0 ? ans : -1;
       
   }
}
