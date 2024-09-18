import java.util.Stack;

public class InBuilt {
    public static void main(String[] args) {
        Stack <Integer> stack=new  Stack<>();
        stack.push(45);
        stack.push(45);
        stack.push(22);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
}
