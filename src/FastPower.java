public class FastPower {
    /**
     * Calculate the a^n % b where a, b and n are all 32bit integers.
     * @param a: A 32bit integer
     * @param b: A 32bit integer
     * @param n: A 32bit integer
     * @return: An integer
     */
    public static int fastPower(int a, int b, int n) {
        // write your code here
        if( n == 0){
            return 1 % b;
        }
        long m = a;
        long ans = 1;
        while (n > 0){
            if((n & 1) > 0){
                ans = (ans * m) % b;
            }
            m = (m * m) % b;
            n = n >> 1;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
//        System.out.println(fastPower(2, 3, 31));
//        System.out.println(fastPower(100, 1000, 1000));
//        System.out.println(fastPower(31, 1, 0));
        System.out.println(fastPower(2, 2147483647, 2147483647));
    }

}
