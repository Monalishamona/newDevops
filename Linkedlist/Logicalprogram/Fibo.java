import java.util.Scanner;



public class Fibo {
//     public static int fibo(int n) {
//         if (n < 2) {
//             return n;
//         }
//         return fibo(n - 1) + fibo(n - 2);
//     }

//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         System.out.println(fibo(6));
//     }
     public static void main(String[] args) {
        int a =0,b=1;
        int c; 
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter : ");
        n = sc.nextInt();
        for(int i =0;i<=n;i++){
            System.out.print(a+" ");
            c= a+b;
            a=b;
            b=c;
        }

     }

}
 
