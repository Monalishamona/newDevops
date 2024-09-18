import java.util.List;
import java.util.ArrayList;
public class TypeInterference2{
  public static void main(String[]args){
List<String> list = new ArrayList<String>();
list.add("helllooo");
for(String element:list){
System.out.println(element);
}
List<String> list2 = new ArrayList<String>();
list2.add(" , I am  MONA");
for(String element:list2){
System.out.println(element);
}

List<Integer> list3 = new ArrayList<Integer>();
list3.add(12);
for(int element:list3){
System.out.println(element);
}
}
}
