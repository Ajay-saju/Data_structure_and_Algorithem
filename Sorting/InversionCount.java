public class InversionCount {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 1 };
        System.out.println("Number of inversions: " + countInversions(arr));
    }

    private static int countInversions(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        } else {
            mergeSortAndCount();
        }
                return 0;
    }

    private static void mergeSortAndCount() {

    }
}
