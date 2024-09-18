public class even {
    public static void main(String[] args){
        int n = 705;
        int[] arr = { 2,3,4,6,4,3,2};
        int[] arrr = { -2,-3,-4,6,4,3,2};
        System.out.println(one(arr));
        System.out.println(onee(arrr));
        System.out.println(isodd(n));

    }
    private static int one(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
    private static int onee(int[] arrr){
        int unique = 0;
        for(int n : arrr){
            unique += n;
        }
        return unique;
    }
    private static  boolean isodd(int n){
        return (n & 1 ) ==1;
    }
    
}
