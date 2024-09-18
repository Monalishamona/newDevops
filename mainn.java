class Classroom{
    int room = 56;
    void display(){
    System.out.println("New program");
        }
    }
class Section extends Classroom {
    void display1(){
    System.out.println("This is room number: " + room);
    }
    }
public static void college(String[] args){
     Section S = new Section();
     S.display();
     S.display1();
    }
    