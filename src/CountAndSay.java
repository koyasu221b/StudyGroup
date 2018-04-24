public class CountAndSay {
    public static String countAndSay(int n) {

        String say = "1";
        for(int i = 2; i <= n ; i++){

            say = getSay(say);
        }

        return say;
    }

    public static String getSay(String in){
        int count = 1;
        char last = in.charAt(0);
        String say = "";
        for(int i=1; i < in.length(); i++){
            if(last == in.charAt(i)){
                count++;
            }else{
                say = say + count + "" + last;
                count = 1;
                last = in.charAt(i);
            }


        }

        return say + count + "" + last;

    }

    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            System.out.println(countAndSay(i));
        }
    }


}
