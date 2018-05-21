public class AddDigits {

    public static int addDigits(int num) {
        return addDigitsHelper(num);

    }

    public static int addDigitsHelper(int num){
        int result  = 0;
        while (num > 0){
            int remaining = num % 10 ;
            num = num /10;
            result += remaining;
        }

        if((result/10) > 0){
            return  addDigitsHelper(result);
        }else{
            return result;
        }
    }

    public static void main(String[] args) {

        System.out.println(addDigits(38));
    }
}
