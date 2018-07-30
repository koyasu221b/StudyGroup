import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1){
            if(set.contains(n)){
                return false;
            }
            int tmp = n;
            int total = 0;
            while (tmp > 0){
               total += (tmp % 10) * (tmp % 10);
               tmp = tmp/10;
            }

            set.add(n);
            n = total;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.print(isHappy(19));
        System.out.print(isHappy(7));
    }
}
