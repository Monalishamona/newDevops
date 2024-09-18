import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ques3{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("f");
        list.add("g");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("s");
        list1.add("c");
        list1.add("p");
        list1.add("g");
        List<String> common = new ArrayList<String>(list);
        common.retainAll(list1);

        
        String result ="["+ "\"" + String.join("\", \"", common) + "\""+"]";

        System.out.println(result); 
        
    

    }
}