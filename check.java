class A{
  int x = 10;
  int sum(int a, int b){
        return a+b;
}
    static class B{
  int y = 40;
  int sum(int p, int q){
        return p+q;
     }
  }
}

public Check{
public static void main(String[]args){
 A obj = new A();
obj.sum(20,40);
A.B obj1 = new A.B();
obj1.sum(9,68);
}
}