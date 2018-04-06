import java.util.HashMap;

public class RomanToInteger {
//    I - 1
//    V - 5
//    X - 10
//    L - 50
//    C - 100
//    D - 500
//    M - 1000

    public static int romanToInt(String s) {
        if(s == null){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

       char[] ss = s.toCharArray();

       int result = 0;
       int previous = 0;
       for(int i = ss.length-1; i>=0; i--){
           int current = map.get(ss[i]);
           if(current < previous){
               result -= current;
           }else{
               result += current;
           }

           previous = current;
       }

       return result;

    }

    public static void main(String[] args) {

        System.out.println(romanToInt("IX")); //9
        System.out.println(romanToInt("MCMLXX")); //1970
        System.out.println(romanToInt("MDCLXVI")); //1666
        System.out.println(romanToInt("XCVIII")); //98
    }
}
