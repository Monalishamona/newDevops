import java.util.Comparator;
import java.util.TreeSet;
class Helper implements Comparator<String>{


public int compare(String str1,String str2){

String first;
String second;

first = str1;
second= str2;
return second.compareTo(first);
}
}
public class ComparatorEx{
public static void main(String[] args){
   TreeSet<String> tree = new TreeSet<String>();
   tree.add("H");
   tree.add("E");
   tree.add("L");
   tree.add("L");
   tree.add("O");
 tree.add("4");
    tree.add("100");

  System.out.println("Set before  using comparartor: "+ tree);

TreeSet<String> tre = new TreeSet<String>(new Helper());
tre.add("H");
tre.add("E");
tre.add("L");
tre.add("L");
tre.add("O");
tre.add("5");

System.out.println("the elements sorted in descending order: "+ tre);
}
}





