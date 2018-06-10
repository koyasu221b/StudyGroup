import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        if(s == null || s.length() == 0){
            return true;
        }

        if(wordDict.isEmpty()){
            return false;
        }

        int maxLength = wordDict.stream().mapToInt(String::length).max().getAsInt();
        System.out.print(maxLength);

        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;


        for(int i=1; i < f.length; i++){
            for(int lastWordLength=1; lastWordLength<=maxLength && lastWordLength <= i; lastWordLength++){
                if(!f[i - lastWordLength]){
                    continue;
                }
                String word = s.substring(i-lastWordLength, i);
                if(wordDict.contains(word)){
                    f[i] = true;
                    break;
                }

            }
        }

        return f[s.length()];
    }

    public static void main(String[] args) {
       System.out.print(wordBreak("leetcode", new ArrayList<>(Arrays.asList("leet", "code"))));
    }
}
