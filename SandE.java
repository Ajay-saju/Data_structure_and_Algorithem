public class SandE {
    // print all sub array start and end indx of subarray length K .

    public static void main(String[] args) {

        int n = 8;
        int k = 3;
        int s = 0;
        int e = s + k -1;
        while (e < n) {
            System.out.println(s + " " + e);
            s++;
            e = s + k -1;
        }
    }

}
