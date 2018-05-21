public class LongestPalindromicSubstring2 {

    public static String longestPalindrome(String s) {
        if(s == null || s.length() <=1 ){
            return s;
        }

        boolean isPal[][] = new boolean[s.length()][s.length()];
        int left = 0;
        int right = 0;
        for(int i=0 ; i < s.length(); i++){
            for(int j=0; j<=i; j++){
                if(i == j){
                    isPal[j][i] = true;
                }else{
                    if(s.charAt(i) == s.charAt(j) && (isPal[j+1][i-1] || i - j <= 2)){
                        isPal[j][i] = true;
                    }

                    if(isPal[j][i]){
                        if(i - j + 1 >= (right - left + 1)){
                            left = j;
                            right = i;
                        }
                    }
                }
            }
        }

        return s.substring(left, right+1);

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcdzdcab"));
        System.out.println(longestPalindrome("ccc"));
    }

}
