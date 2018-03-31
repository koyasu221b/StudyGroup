public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        if(s == null){
            return false;
        }

        char[] ss = s.toCharArray();
        int n = ss.length;
        int left = 0;
        int right = n-1;
        while(left <= right){
            while (left < n && !Character.isLetterOrDigit(ss[left])){
               left++;
            }

            while (right >= 0 &&!Character.isLetterOrDigit(ss[right])){
                right--;
            }

            if(left >= n || right < 0){
                break;
            }

            if(Character.toLowerCase(ss[left]) == Character.toLowerCase(ss[right])){
                left++;
                right--;
            }
            else{
                return false;
            }

        }

        return true;

    }


    public static void main(String args[]){
        System.out.println(isPalindrome(" ")); //true
       System.out.println(isPalindrome("A man, a plan, a canal: Panama")); //true
       System.out.println(isPalindrome("race a car")); //false
       System.out.println(isPalindrome("")); //true
        System.out.println(isPalindrome(".")); //true
        System.out.println(isPalindrome(".,...,")); //true
    }
}
