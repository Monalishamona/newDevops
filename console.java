import java.io.Console;

class Console{
public static void main(String[] args)
{
   Console c = System.console();
   System.out.println("Enter your PASS: ");
   char[] ch = c.readPassword();
String pass = String.valueOf(ch);
   System.out.println("Password is: "+pass);
}
}