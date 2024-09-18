class RBI{
  static int rate = 5;
  int interest1 (int p, int t){
    int interest = (p*t*rate)/100;
return interest;
}
  class PNB{
      int interest2(int p, int t){
    int interest = (p*t*rate)/100;
return interest;
}

    }
}

public class SI{
public static void main(String[] args){
  
  RBI obj =  new RBI();
  System.out.println("the SI of Rbi is :" + obj.interest1(100890, 4));
  RBI.PNB obj1 = obj.new PNB();
  System.out.println("the SI of Pnb is :" + obj1.interest2(20600, 6));
 }
}

  