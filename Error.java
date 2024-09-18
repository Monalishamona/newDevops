public class Error{

   public static void main(String[] args){
      try{
           int a = 20;
           int b= 0;
           int c = a/b;
           System.out.println(c);
}
catch(ArithmeticException e){
       System.out.println("enter the proper value "+e);

}
}
}