public class recursion1 {
    public static void main(String[] args) {
        print(8);
    }
    static void print(int n ){
        if(n == 0 ){
            return ;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
        
    }
    
}
