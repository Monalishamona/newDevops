import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        sub("", "abc");
    }
     static ArrayList<String> sub(String p ,String up, ArrayList<>){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        sub(p+ch, up.substring(1));
        sub(p, up.substring(1));
}
}
