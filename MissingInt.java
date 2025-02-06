import java.util.Collection;
import java.util.Collections;

public class MissingInt {
    public static void main(String[] args) {
        int [] a = {10,15,3,2,8,1 };
        System.out.println(firstMissingInt(a));
            }
        
            static int firstMissingInt(int []A){

        int n = A.length;

        for(int i = 0; i< n ; i++){

            int num = A[i];
            
            if( num > 0 && num <= n ){

                int pos = num-1;

                if( A[pos] != A[i]){
                    int temp = A[i];
                    A[i] = A[pos];
                    A[pos] = temp;
                    i--;
                }
            }
        }

        for( int i = 0; i< n ; i++){
            if( A[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
    
}
