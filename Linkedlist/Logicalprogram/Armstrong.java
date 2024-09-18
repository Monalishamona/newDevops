import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n;
        int sum =0;
        int rem ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int real=n;
        while(n>0){
            rem = n %10;
            sum = rem*rem*rem +sum;
            n = n/10;

        }
        if(sum == real
        ){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
    
}
