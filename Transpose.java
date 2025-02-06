import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int n = 3; // Define the size of the square matrix (4x4 in this example)
        int[][] matrix = new int[n][n];

        // Fill the matrix with sample values and print it
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = value++;
                System.out.print(matrix[i][j] + "\t"); // Print each element
            }
            System.out.println(); // Newline for each row
        }
        findTranspose(matrix);
    }

    static void findTranspose(int[][] A) {

        int n = A.length;

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // swap(A[i][j], A[j][i]);

                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
            // System.out.println();
        }
        printing(A);
    }

    static void printing(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void swap(int i, int j) {

        int temp = i;
        i = j;
        j = temp;

    }
}
