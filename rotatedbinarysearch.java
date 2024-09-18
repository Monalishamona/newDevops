public class rotatedbinarysearch {
    static int search(int[] arr , int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+ (e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>=arr[s]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        System.out.println(search(arr, 3, 0, arr.length-1));
    }
    
}
