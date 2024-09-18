import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ques2 {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
          List<Integer> numbers = new ArrayList<>();
          numbers.add(12);
          numbers.add(22);
          numbers.add(33);
          numbers.add(23);
          numbers.add(40);
          numbers.add(24);
          numbers.add(100);
          numbers.add(290);
          numbers.add(1000);
          numbers.add(122);
          numbers.add(87);
          
          List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 != 0)
          .collect(Collectors.toList());
          System.out.println(evenNumbers);



    }
    
}
