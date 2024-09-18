import java.util.Comparator;
import java.util.TreeSet;
public class Tree{
public static void main(String[] args){
TreeSet<Integer> tree = new TreeSet<Integer>();
tree.add(20);
tree.add(10);
tree.add(56);
tree.add(9);
 System.out.println("Tree set values are:" + tree);
Comparator comp = tree.comparator();
System.out.println("since the comparator values is :" + comp );
System.out.println("it follows natural order");
}



}