public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null){
            return -1;
        }
        char[] needleArray = needle.toCharArray();
        char[] haystackArray = haystack.toCharArray();

        for(int i = 0; i < haystackArray.length - needleArray.length + 1; i++){

            int j = 0;
            for(j = 0; j < needleArray.length; j++){
                if(needleArray[j] != haystackArray[i+j]){
                    break;
                }
            }

            if(j == needleArray.length){
                return i;
            }


        }

        return -1;

    }


    public static void main(String args[]){
        System.out.println(strStr("hello", "ll")); //2
        System.out.println(strStr("aaaaa", "bba")); //-1
        System.out.println(strStr("", "")); //0
    }
}
