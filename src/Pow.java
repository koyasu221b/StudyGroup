public class Pow {
    /*
     * @param x: the base number
     * @param n: the power number
     * @return: the result
     */
    public static double myPow(double x, int n) {
        // write your code here
        double ans = 1.0;
        double m = n > 0 ? x :  1.0 / x;
        boolean isNegtive = false;
        int pow = n;
        if(n < 0){
            pow = -( n + 1);
            isNegtive = true;
        }
        while (pow > 0){
            if((pow & 1) > 0){
               ans *= m;
            }
            m = m*m;
            pow = pow >>1;
        }

        if(isNegtive){
            ans*= (1.0/x);
        }

        return ans;
    }


    public static void main(String[] args) {
        System.out.println(myPow(2.1,3 ));
        System.out.println(myPow(0,1 ));
        System.out.println(myPow(1,0 ));
        System.out.println(myPow(34.00515,-3 ));
        System.out.println(myPow(2.00000,-2147483648 ));
    }
}
