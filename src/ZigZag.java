import java.util.ArrayList;
import java.util.List;

public class ZigZag {

    public static String convert(String s, int numRows) {

        if(numRows == 1 || s == null){
            return s;
        }

        int cycle = 2*numRows - 2;

        List<List<String>> results = new ArrayList<List<String>>();
        char[] ss = s.toCharArray();
        for(int i=0; i<ss.length;i++) {
            results.add(new ArrayList<String>());
        }


        for (int i=0; i<ss.length; i++){
            if(i%cycle < numRows){
                List<String> row = results.get( i%cycle);
                row.add(String.valueOf(ss[i]));
            }else{
                List<String> row = results.get( cycle -i%cycle);
                row.add(String.valueOf(ss[i]));
            }
        }

        String ret = "";
        for(List<String> result: results){
            String tmp = result.stream().reduce("", (s1, s2) -> (s1+s2));
            ret += tmp;
        }

        return ret;
    }

    public static void main(String[] args) {


        System.out.println("Hello World!");

        //"PAYPALISHIRING"

        // n = 2 => 2   2A + B = 2
        // n = 3 => 4   3A + B = 4
        // n = 4 => 6   4A + B = 6 => A = 2, B = -2

        String result = convert("PAYPALISHIRING", 3);
        System.out.println(result);
    }
}
