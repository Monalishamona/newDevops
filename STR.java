public class Tostringexp {
    public static void main(String[] args){
        Number C1 = new Number(10,38) {
            System.out.println(C1);
        }
    }
    
}
 class Number{
    private double re,im;
    public Number(double re, double im){
        this.re=re;
        this.im=im;
    }
    public double getReal(){
        return this.re;
    }
    public double getImaginary(){
        return this.im;
    }
    public void setReal(double re){
        this.re=re;
    }
    public void setImaginary(double im){
        this.im=im;
    }
 }
