public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        return x == reverse(x);
    }

    public static int reverse(int x){
        int result = 0;
        while (x > 0){
            result = result* 10 + (x % 10);
            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11211));
        System.out.println(isPalindrome(112111));
    }
}
