public class SumOfAllSA {

    
 public static void main(String[] args) {
    int[]a= {10,20,30};
    sumOfAllSubArrays(a);
 }
 public static void sumOfAllSubArrays(int[]A){
    
    int n = A.length;

    int totalSum = 0;

    // for(int s = 0; s < n ; s++){
    //     int sum = 0;
    //    for (int e = s ; e< n ; e++){
    //         sum = sum + A[e];
    //          totalSum +=sum ;  
    //    } 
      
    // }
    // int sum =0;
    for (int i = 0; i< n ; i++){
         
        int freq= (i+1) * (n-i);
        int sum = A[i]*freq;
        totalSum +=sum; 
    }
    System.out.println(totalSum); 

}
    
}


