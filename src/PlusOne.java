public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int carries = 1;
        for(int i=digits.length-1; i >=0 && carries > 0; i--){
            int tmp = digits[i] + carries;
            digits[i] = tmp % 10;
            carries = tmp / 10;
        }

        if(carries > 0){
           int[] newDigits = new int[digits.length + 1];
           for(int i=1; i < newDigits.length; i++){
                newDigits[i] = digits[i-1];
           }
           newDigits[0] = carries;
           return newDigits;
        }

        return digits;
    }

    public static void display(int [] digits){
            for(int i=0;i<digits.length;i++)    {
                System.out.print(digits[i]);
            }
            System.out.println();
    }

    public static void main(String[] args){
        display(plusOne(new int[]{9}));
        display(plusOne(new int[]{1,1}));
    }
}
