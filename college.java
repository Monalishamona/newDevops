class classroom{
    int room;
    void display(){
        System.out.println("hello");
    }
}
class  section extends classroom{
    @Override
    void display1(){
        System.out.println("Room" + room );
    }
    super.display();
}
public class college{
    public static void main(String[] args){
        section s1 = new section();
        classroom cr1 = new classroom();
        cr1.display();
        cr1.display1();
        s1.room = 50;
        s1.display();
        s1.display1();
    }
}