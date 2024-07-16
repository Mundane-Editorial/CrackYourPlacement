package Day_3;

public class reverse_words_in_string_151 {
    public static void main(String args[]){
        String s = "this is an hp laptop";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        s = s.trim(); // aage peeche k faltu spaces hta dega trim function.
        String[] res = s.split(" ");
        String str = "";
        for(int i=res.length-1; i>=0; i--){
            str = str + res[i] + " ";
        }
        str = str.trim();
        return str;
    }
}
