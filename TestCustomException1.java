class InvalidAgeException extends Exception{
 public InvalidAgeException(String str)
{
super(str);
}
}
public class TestCustomException1{
   static void validate(int age) throws InvalidAgeException{
    if(age<18){
         throw new InvalidAgeException("age is not valid to vote");
}else{
System.out.println("Welcome to vote");
}
}
public static void main(String[] args){
{try{
validate(13);
}catch(InvalidAgeException ex){
System.out.println("caught the exception");

System.out.println("exception occured"+ex);
}
System.out.println("res of thw code/...........");
}
}