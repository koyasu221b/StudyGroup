public class NumberOf1Bits {

    // you need to treat n as an unsigned value
    public static int hammingWeight(long n) {

        //000000000000000000000000010100000
        //000000000000000000000000010011111
        //-----------------------------------
        int sum = 0;
        long nn = (long) n;
        while (nn > 0){
            sum+= nn & 1;
            nn = nn >> 1;
        }

        return sum;

    }



    public static void main(String[] args) {
        System.out.println(hammingWeight(  2147483648L));
    }
}
