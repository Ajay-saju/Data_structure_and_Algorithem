import java.util.Arrays;

class PrifixSum{
    public static void main(String[] args) {
          

        // int []a = {3,-2,8,-5,4,0,1};
        solve(18);
        
    }
    // public static void  solve (int []A,int b , int c){
        public static void  solve (int  n){


        int pf []= new int[n];
        pf[0] = 1;
        int count = 2;
      
        for(int i = 1; i< n; i++){

            pf[i] = pf[i-1] + count;
            count ++;

        }
        System.out.println(Arrays.toString(pf));
        
    }
}