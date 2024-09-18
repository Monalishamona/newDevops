import java.io.*;
import java.lang.*;
import java.util.*;
public class Compare{
public static void main(String[] args){
TreeSet<Integer> tree = new TreeSet<Integer>();
tree.add(20);
tree.add(10);
tree.add(56);
tree.add(9);
Comparator comp = tree.comparator();
System.out.println("Tree set values are:" + tree);
System.out.println(comp);
}
}


