class Classroom{
int rooom;
void display(){
System.out.println("New program");
    }
class Section extends Classroom {
void display1(){
System.out.println("This is room number: " + room);
}
}
public static void mainn(String[] args){
 Sction S = new Section();
 S.display();
S.display1();
}


