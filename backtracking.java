import java.util.ArrayList;

public class backtracking {
    static int count(int r , int c){
        if( r==1 ||c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }
    static ArrayList<String> pathRet(String p , int r ,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(p +'D', r-1, c));
        }
        if(c>1){
            list.addAll(pathRet(p+'R', r, c-1));
        }
        return list;
    }
    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        System.out.println(pathRet("", 3, 3));
    }
    
}
