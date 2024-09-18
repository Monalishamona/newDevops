class Person{
public void getFirst(){
  System.out.println(" Mona");
}

public void getLast(){
  System.out.println("Lisha");
}

}

class Employee extends Person{
public void getID(){
  System.out.println(" 1");
}
@Override
public void getLast(){
  System.out.println("Lishaaa");
}

}
public class Managerr{
public static void main(String[] args){
 Employee hr = new Employee();
 hr.getFirst();
 hr.getLast();
 hr.getID();
}
}
