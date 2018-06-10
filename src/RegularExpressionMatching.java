public class RegularExpressionMatching {
   /*
      i = text
      j = pattern

    T[i][j] =

    1.
       a. abc /abc
       b. abc /ab.

       if pattern[j] == str[i] :
       a. T[i-1][j-1] && str[i] == pattern[j]

       if pattern[j] == '.'
       b. T[i-l][j-1] && pattern[j] == '.'

    2.
        a. abc / abcd*
        b. abc / abc*
        c. abc / ab.*

        if pattern[j] = '*'
          a.  T[i][j-2] -> 0 occurrence
          b.  T[i-1][j] && str[i] == pattern[j-1]
          c   T[i-i][j] && pattern[j-1] == '.'
   */


    public static boolean isMatch(String ss, String pp) {
        char[] text = ss.toCharArray();
        char[] pattern = pp.toCharArray();

        int m = text.length;
        int n = pattern.length;
        boolean[][] f = new boolean[m+1][n+1];
        f[0][0] = true;

        for(int i = 1; i < n+1; i++){
            if(pattern[i-1] == '*'){
                f[0][i] = f[0][i-2];
            }
        }

        for(int i = 1; i < m+1; i++){
            for(int j = 1; j< n+1 ; j++){
                if(pattern[j-1] == '.' || pattern[j-1] == text[i-1]){
                    f[i][j] = f[i-1][j-1];
                }else if(pattern[j-1] == '*'){
                    if(pattern[j-2] == '.' || pattern[j-2] == text[i-1]){
                        f[i][j] = f[i][j-2] | f[i-1][j];
                    }else{
                        f[i][j] = f[i][j-2];
                    }

                }else{
                    f[i][j] = false;
                }
            }
        }

        return f[m][n];

    }


    public static void main(String[] args) {
            isMatch("aa", "a");
    }
}
