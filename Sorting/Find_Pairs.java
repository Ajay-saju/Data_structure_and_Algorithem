import java.util.Arrays;

public class Find_Pairs {

    // give 2 array, a[n] and b[m] calculate the nuber of pair i,j such that a[i] >
    // b[j]
    // A[3] = {7,0,3}
    // B[3] = {2,0,6}
    // ans = (7,2) (7,0) (7,6) (3,2) (3,0)
    // B.F ---> iterate throug the loops and find the pairs o(n^2)

    public static void main(String[] args) {
        int[] A = { 7, 1, 3 };
        int[] B = { 2, 5, 6 };

        System.out.println(countPairs(A, B));
    }

    private static int countPairs(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);
        int ans = mergeArrays(a, b);
        return ans;
    }

    private static int mergeArrays(int[] a, int[] b) {
      int n = a.length+ b.length;
      int ans[] = new int[n];
      int count = 0;
      int p1 = 0;
      int p2 = 0;
      int index = 0;

      while (p1 < a.length && p2< b.length){

        if( a[p1] > b [p2]){


            ans[index]  = b[p2]; 
            p2++;
            index++;
            count = count + (a.length-p1);

            
        }else{
            ans[index] = a[p1];
            p1++;
            index++;
        }
      }
      System.out.println(Arrays.toString(ans));
      return count;
        
    }
}
