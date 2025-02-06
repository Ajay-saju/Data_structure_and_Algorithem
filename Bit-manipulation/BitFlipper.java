public class BitFlipper {
    public static void main(String[] args) {
        System.out.println(flipBits(7));
        // System.out.println(1<<3);
    }
    public static int flipBits(int A){

        if(A == 0){
            return 1;
        }
        
        // Calculate the number of bits in the integer 
        int numBits = (int) ((Math.log(A) / Math.log(2)) + 1);
        
        // Create a bit mask with all 1s

        int bitMask =(1 << numBits) - 1;

        // Flip all the bits

        A = A ^ bitMask;

        return A;

    }
}
