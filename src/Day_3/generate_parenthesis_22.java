package Day_3;

import java.util.ArrayList;
import java.util.List;

public class generate_parenthesis_22 {
    public static void main(String args[]){
        int n = 5;
        System.out.println(generateparenthesis(n));
    }

    private static List<String> generateparenthesis(int n) {
        List<String> list = new ArrayList<>();
        wellformparenthesis("(", 1, 0, list, n);
        System.out.println("length of total valid combinations ::: " + list.size());
        return list;
    }

    private static void wellformparenthesis(String s, int open, int close, List<String> list, int n) {
        if(s.length() == 2*n){
            list.add(s);
            return ;
        }

        if(open<n){
            wellformparenthesis(s+"(", open+1, close, list, n);
        }
        if(close<open){
            wellformparenthesis(s+")", open, close+1, list, n);
        }
    }
}
