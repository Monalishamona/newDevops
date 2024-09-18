import java.util.List;
import java.util.ArrayList;
public class TypeInterference{
  public static void main(String[] args){
List<Integer> list = new ArrayList<Integer>();
List.get(0);
list.add(12);
for(Integer element:list){
System.out.println(element);
}

List<Integer> list2 = new ArrayList<Integer>();
list2.add(12);
for(Integer element:list2){
System.out.println(element);
}
}
}