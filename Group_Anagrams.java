import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;






// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]



public class Group_Anagrams {
  public static void main(String[] args) {

    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

    Arrays.sort(strs);
    // System.out.println(Arrays.toString(strs));

    List<List<String>> temp = groupAnagrams(strs);
    for (List<String> list : temp) {
    System.out.print(list);

    }
  }

  private static List<List<String>> groupAnagrams(String[] strs) {

    if (strs.length == 0) {
      return new ArrayList();
    }

    HashMap<String, List<String>> ansMap = new HashMap<>();

    for (int i = 0; i < strs.length; i++) { //O(n)

      String str = strs[i];

      int[] strArr = new int[26];

      // int idx = 0;

      for (int j = 0; j < str.length(); j++) {
        char ch = str.charAt(j);

        strArr[ch-'a']++;
    
      }
      StringBuilder sb  = new StringBuilder();
      for(int n : strArr){
        sb.append(n);
      }
      String key = sb.toString();

      
      System.out.println(key);


      if (ansMap.containsKey(key)) {

        
        ansMap.get(key).add(strs[i]);

      } else {

        List<String> temp = new ArrayList<>();
        temp.add(strs[i]);
        ansMap.put(key, temp);

      }

    }
    List<List<String>> ans = new ArrayList<>();

    Collection<List<String>> allValues = ansMap.values();

    for (List<String> list : allValues) {
      ans.add(list);

    }
    return ans;
  }

}

// Time complexity - o(N*K)
// n = array length 
// k = string length

// space complexity - o(N*K)
// n = Hashmap 
// k = Each string has a length of up to K so the total space required to store all strings is O(N*K)

