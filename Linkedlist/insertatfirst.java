public class insertatfirst {
    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }

    }
    private Node head;
    private Node tail;
    private int size;
    public insertatfirst(){
        this.size=0;
    }
    public void insert(int val){
        Node node = new Node(val);
        node.next=head;
        head= node;
        if(tail==null){
            tail=head;
        }size++;

    }
    // public void display(){
    //     Node temp = head;
    //     while(temp!=null){
    //         System.out.println(temp.value +" -> ");
    //         temp = temp.next;
    //     }
    //     System.out.println("End");
    // }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        insertatfirst list = new insertatfirst();
        list.insert(12);
        list.insert(34);
        list.display();
    }
    
}
