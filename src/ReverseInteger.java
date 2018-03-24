import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

    public static int reverse(int x) {
        int xx = Math.abs(x);
        int result = 0;


        while(xx > 0){

            // result*=10
            int addNumber = result;
            for(int i =1 ; i<=9;i++) {
                if(Integer.MAX_VALUE - addNumber >= result){
                    result+=addNumber;
                }
                else {
                    return 0;
                }
            }

            int re = xx % 10;
            xx = xx /10;

            result+=re;

        }

        return (x >0) ? result: result*(-1);
    }

    public static void main(String[] args) {

        System.out.println(reverse(1534236469));
        System.out.println(reverse(123));
        System.out.println(reverse(-2147483412));
        System.out.println("Hello World!");

//        bool int_add_safe(int a, int b) {
//            if (a >= 0 && b >= 0)
//                return INT_MAX - a >= b;
//            if (a < 0 && b < 0)
//                return INT_MIN - a <= b;
//            return true;
//        }

    }
}
