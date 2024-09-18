import java.util.ArrayList;

public class ls {
    public static void main(String[] args) {
       int[] arr = {4,23,22,11,11,30,33};
    //    int length = arr.length-1;
    //    System.out.println(lsfromlast(arr,22,length));
       System.out.println(findAllIndex(arr, 11, 0, new ArrayList<>()));

       
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
           list.add(index);
        }
        return findAllIndex(arr, target, index+1,list);
    }
    // static boolean ls(int[] arr , int target, int index){
    //     if(index== arr.length){
    //         return false;
    //     }
    //     return arr[index] == target || ls(arr, target, index+1);
    // }
    // static int ls(int[] arr, int target, int index){
    //     if(index==arr.length){
    //         return -1;
    //     }
    //     if(arr[index]==target){
    //         return index;
    //     }
    //     return ls(arr, target, index+1);
    // }
    // static int lsfromlast(int[] arr, int target, int index){
    //     if(index==-1){
    //         return -1;
    //     }
    //     if(arr[index]==target){
    //         return index;
    //     }
    //     return lsfromlast(arr, target, index- 1);
    // }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr, int target, int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findallindex(arr, target, index+1);
    }
    
}
