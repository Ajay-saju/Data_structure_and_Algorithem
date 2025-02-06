public class AllDiagonals {
    public static void main(String[] args) {
        // Initialize a 5x4 matrix
        int[][] matrix = new int[5][4];

        // Fill the matrix with sample values and print
        int value = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = value++;
                System.out.print(matrix[i][j] + "\t"); // Print each element
            }
            System.out.println(); // Newline for each row
        }
        printAllDiagonals(matrix);
    }

    public static void printAllDiagonals (int [][] A){

        int n = A.length;
        int m = A[0].length;


        for( int col = 0 ; col < m ; col++ ){
            int x = 0;
            int y = col;

            while(y >=0 ){
                System.out.print(A[x][y] +" ");
                x++;
                y--;
                
            }
            System.out.println();
        }
        // System.out.println();
        for(int row = 1; row < n ; row++){
            int x = row ;
            int y = m-1;
            while( x<n  ){
                System.out.print(A[x][y]+ " ");
                x++;
                y--;
            }
            System.out.println();
        }
    }
}
