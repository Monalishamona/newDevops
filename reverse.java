public class reverse {
    static int sum =0;
    static int reverse(int n){
        if(n==0){
            return 0;
        }
        int rem = n %10;
        sum = sum*10+rem;
         return reverse(n/10);

        
    }
    static boolean palindrome(int n){
        return n == reverse(n);
    }
    
    public static void main(String[] args) {
         
        System.out.print(palindrome(12321));
    }
    
}
