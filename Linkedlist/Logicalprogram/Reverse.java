import java.util.Scanner;

public class Reverse {
    
    // public static int reverse(int n){
    //     int sum =0;
    //     if(n==0){
    //         return sum;
    //     }
    //      int r=n%10;
    //      sum = sum*10+r;
    //      n = n/10;
    //      return reverse(n);

    // }
    // public static void main(String[] args) {
    //     System.out.println(reverse(1234));
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,r;
        a = sc.nextInt();
        int sum =0;
        int real = a;
        while(a>0){
            
             r = a%10;
            //  
            sum = sum*10 + r;
            
            a =a/10;



        }
        if(sum== real){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
       
    }
    
}
