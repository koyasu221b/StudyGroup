import java.util.HashSet;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        // write your code here
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        int remains = set.size();

        if (remains == 0) {
            return s.length();
        } else{
            return s.length() - remains + 1;
        }
    }

    public static void main(String args[]){
        System.out.println(longestPalindrome("ABCDE"));
        System.out.println(longestPalindrome("ABA"));
        System.out.println(longestPalindrome("ABAB"));
    }
}
