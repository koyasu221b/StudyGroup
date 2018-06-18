import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    /**
     * @param num: An integer
     * @return: an integer array
     */
    public List<Integer> primeFactorization(int num) {
        // write your code here
        List<Integer> result = new ArrayList<>();
        int up = (int) Math.sqrt(num);
        for(int k = 2 ; k <= up && k > 1; k++){
            while (num % k == 0){
                result.add(k);
                num = num / k;
            }
        }

        if(num > 1){
            result.add(num);
        }

        return result;
    }
}
