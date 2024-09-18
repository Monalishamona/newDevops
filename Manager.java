class Employee{
  public void work(){
    System.out.println("working");

}
public void getSalary(){
    System.out.println("salary");

}

}

class HRManager extends Employee{
       @Override
       public void work(){
System.out.println("workingggg");

}
public void add(){
    System.out.println("adding employee");

}


}
public class Manager{
public static void main(String[] args){
 HRManager hr = new HRManager();
 hr.work();
hr.add();
hr.getSalary();
}
}
