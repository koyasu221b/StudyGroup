import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if(s.equals("") || s == null || s.length() == 1){
            return s;
        }

        boolean isPalindrom[][] = new boolean[s.length()][s.length()];
        int left = 0;
        int right = 0;

        String result = "";

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<=i;j++){
                if(i==j){
                    isPalindrom[i][j] = true;
                }else{
                    if((isPalindrom[i-1][j+1] || i - j <=2)){
                        if(s.charAt(i) == s.charAt(j)){
                            isPalindrom[i][j] = true;
                        }
                    }
                }

                if(isPalindrom[i][j]){
                    if(Math.abs(i-j) >= Math.abs(right - left)){
                        left = j;
                        right = i;
                       result = s.substring(j, i+1) ;
                    }
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {


        System.out.println(longestPalindrome("xabay"));

    }
}
