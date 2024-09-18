class A{
int x= 30;
int y= 60;
int sum(int a, int b){
return a+b;
class c{
int sum2(int u ,int v){
return u+v;
}


}
class B{
int sum1(int p ,int q){
return p+q;
}
}
}
public  class Object{
public static void main(String[] args){
  A obj = new A();
  System.out.println(obj.sum(20,40));
  A.B obj1 = obj.new B();
  System.out.println(obj1.sum1(200,600));
  }
}




