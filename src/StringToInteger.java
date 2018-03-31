public class StringToInteger {
    public static int myAtoi(String str) {

        long result = 0;
        str = str.trim();
        char[] strArray = str.toCharArray();
        boolean isMinusSign = false;
        int singNumber = 0;
        for(int i = 0; i < strArray.length; i++){
            if(singNumber > 1){
                return 0;
            }
            if(strArray[i] == '+'){
                singNumber++;
                continue;
            }
            else if(strArray[i] == '-'){
                isMinusSign = true;
                singNumber++;
                continue;
            }

            if(Character.isDigit(strArray[i])){
                result*=10;
                result += Integer.parseInt(String.valueOf(strArray[i]));

                if(result > Integer.MAX_VALUE){
                    if(isMinusSign){
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }

            }else {
                break;

            }
        }

        result = isMinusSign == true ? result*(-1): result;
        return (int) result;
    }

    public static void main(String[] args){
        System.out.println(myAtoi("  -0012a42"));
        System.out.println(myAtoi("  -a0012a42"));
    }
}
