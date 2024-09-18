class Rectangle{
     public int length;
     public int breadth;
    
     public Rectangle(int length, int breadth){
         this.length=length;
         this.breadth= breadth;
}

     public void  perimeter(){
          System.out.println("Perimeter :"+2*(length+breadth));
}
     public void  area(){
         System.out.println("aRea :"  + length*breadth);

     
}
}

class Square extends Rectangle{ 
public Square(int side){
    super(side,side);
}     
       
  
}
public class Calculation{
public static void main(String[] args){
Rectangle rectangle = new Rectangle(5,4);
rectangle.perimeter();
rectangle.area();
Square square = new Square(5);
square.perimeter();
square.area();




int[] squares = new Square[10];
        for (int i = 0; i < 10; i++) {
            squares[i] = new Square(5);
            System.out.println("Area of Square " + (i+1) + ": " + (squares[i].length * squares[i].breadth));
        }       
}
}