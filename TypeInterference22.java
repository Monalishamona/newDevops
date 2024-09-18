class GenericClass<X>{
<T>GenericClass(T t)
{
System.out.println(t);
}
}
public class TypeInterference22{
public static void main(String[] args){
   GenericClass<String>gc2 = new GenericClass<>("Hello");
}
}