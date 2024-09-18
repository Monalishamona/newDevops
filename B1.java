class B {
    public int  bValue= 2;
    public int  getBValue(){
        return bValue;
    }
    
}

class A extends B{
    public int  aValue= 2;
    public int  getAValue(){
        return aValue;
    }
    public int  getBValue(){
        // return  2*bValue;
        bValue = 2*bValue;
        return  2*bValue;

    }
}

public class B1{
    public static void main(String[] args)
{
    A a = new A();
    a.getAValue();

    a.getBValue();
    System.out.println(a.getAValue());
    System.out.println(a.getBValue());
}
}