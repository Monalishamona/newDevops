import java.util.Scanner;
public class Stack{ 
  
    public static void main(String[] args){ 
         Scanner st = new  Scanner (System.in);
int a = st.nextInt();
int b = st.nextInt();
try{
String x = null;
int c= a/b;
System.out.println(c);
System.out.println(x.toUpperCase());
 }
catch(ArithmeticException e){
   System.out.println("hello error " +e);
}
catch(Exception e){
 
 System.out.println("ERROR OCCURED: "+e);
 }
finally{

System.out.println("Friends this is final")';
}
} 

}