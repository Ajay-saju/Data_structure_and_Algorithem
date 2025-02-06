public class Anagram1 {
    public static void main(String[] args) {
        String s = "CAT";
        String t = "CAR";
        System.out.println(checkAnagram(s, t));

    }

    private static boolean checkAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char temp1 = s.charAt(i);
            char temp2 = t.charAt(i);

            charCount[temp1 - 65]++;
            charCount[temp2 - 65]--;

        }
        for (int nums : charCount) {
            if (nums >  0) {
                return false;
            }
        }
        return true;

        // char a = 'A';
        // char b = 'a';
        // int ascii1 = (int)a;
        // int ascii2 = (int)b;

        // System.out.println(ascii1);
        // System.out.println(ascii2);
        // return true;
    }
}
