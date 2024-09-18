import java.io.*;
import java.lang.*;
import java.util.*;
class Student{
    int roll;
    String name, address;
    public Student(int roll, String name, String address){
           this.roll= roll;
this.name= name;
this.address= address;
}
public String toString(){
      return this.roll + " "+ this.name +  " " + this.address;

}
}
class SortByRoll implements Comparator<Student>{

public int compare(Student a, Student b){

   return a.name.compareTo(b.name);

}
}

class Comparatorr{

public static void main(String[] args){
ArrayList<Student> ar = new ArrayList<Student>();
ar.add(new Student(111,"MONA","bihar"));
ar.add(new Student(13,"raj","delhi"));
ar.add(new Student(121,"riya","Up"));
ar.add(new Student(11,"sonu","Mp"));
System.out.println("unsorted:");
for (int i =0;i<ar.size();i++)
   System.out.println(ar.get(i));
Collections.sort(ar, new Sort());
System.out.println("\nSorted by name ");
for(int i =0; i <ar.size();i++)
 System.out.println(ar.get(i));
Collections.sort(ar, new Sortbyname());
System.out.println("\nSorted by name ");
for(int i =0; i <ar.size();i++)
 System.out.println(ar.get(i));

}
}





