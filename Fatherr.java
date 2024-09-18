class father{
int fage(int a){
  return a; 
}
class son{
int sage(int x){
  return x;
}
}
}
public class Fatherr{
public static void main(String[] args){
   int mage = 40;
   father obj = new father();
   
   System.out.println("The age of the father is :" + obj.fage(45));
   father.son obj1 = obj.new son();
System.out.println("The age of the mother is :" + mage);
System.out.println("The age of the son is :" + obj1.sage(20));
}
}
    




  