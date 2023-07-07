public class ReverseWords {
    public static void main(String[] args) {
        String str = "a good   example";
        // blue is sky the
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String str){
        StringBuilder sb = new StringBuilder(str);
        String s = sb.reverse().toString();
        String[] s1 = s.split(" ");
        String ans= "";
        int c = 0;
        for (String sub :
                s1) {
            c++;
            if (sub.length()==0) continue;
            StringBuilder ss = new StringBuilder(sub);
            if (c != s1.length){
                ans += ss.reverse().toString();
                ans += " ";
            }else {
                ans += ss.reverse().toString();
            }



        }
        return ans;

    }
}
