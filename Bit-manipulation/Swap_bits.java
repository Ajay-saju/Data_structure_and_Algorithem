public class Swap_bits {
    
        public static int swapBits(int A, int B, int C) {
            B = B-1;
            C = C-1;
            // Extract the B-th and C-th bits
            int bitB = (A >> B) & 1;
            int bitC = (A >> C) & 1;
    
            // If the bits are different, swap them
            if (bitB != bitC) {
                // Create a bit mask with 1s at positions B and C
                int bitMask = (1 << B) | (1 << C);
                // Toggle the bits at positions B and C
                A ^= bitMask;     
            }
    
            return A;
        }
    
        public static void main(String[] args) {
            // Test Case 1
            int A1 = 9; // Binary: 1001
            int B1 = 1;
            int C1 = 2;
            int result1 = swapBits(A1, B1, C1);
            System.out.println("Original number: " + A1 + " (binary: " + Integer.toBinaryString(A1) + ")");
            System.out.println("Number after swapping bits at positions " + B1 + " and " + C1 + ": " + result1 + " (binary: " + Integer.toBinaryString(result1) + ")");
    
            // Test Case 2
            int A2 = 1; // Binary: 0001
            int B2 = 1;
            int C2 = 3;
            int result2 = swapBits(A2, B2, C2);
            System.out.println("Original number: " + A2 + " (binary: " + Integer.toBinaryString(A2) + ")");
            System.out.println("Number after swapping bits at positions " + B2 + " and " + C2 + ": " + result2 + " (binary: " + Integer.toBinaryString(result2) + ")");
        }
    }
    


