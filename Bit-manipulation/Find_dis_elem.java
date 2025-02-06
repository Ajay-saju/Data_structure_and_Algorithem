public class Find_dis_elem {
    public static void main(String[] args) {
        System.out.println(20>>2);
        int[] A = { 4, 5, 4, 1, 6, 6, 5, 2 };

        // step 1 -- find the XOR of all elements
        int v = 0;
        for (int i = 0; i < A.length; i++) {
            v ^= A[i];
        }


        // step 2 -- find the rightmost set bit

        int pos = 0;
        for (int i = 0; i < 32; i++) {
            if (checkBit(v, i)) {
                pos = i;
                break;
            }
        }

        // step 3 -- divide the array into two groups based on the rightmost set bit

        int v1 = 0;
        int v2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (checkBit(A[i], pos)) {
                v1 = v1 ^ A[i];
            } else {
                v2 = v2 ^ A[i];
            }
        }
        System.out.println(v1 +"  "+v2);
    }

    private static boolean checkBit(int N, int i) {
             if( (N & (1<<i)) != 0 ){
                return true ;
             }else{
               return  false;
             }
    }
}
