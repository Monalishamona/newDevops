public class DoublyLL {
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val= val;
        }
        public Node(int val,Node next, Node prev){
            this.val=val;
            this.prev=prev;
            this.next=next;
        }
    }
    Node head;
    public void insertAtFirst(int val){
        Node node= new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;

    }
    public void insertAtLastt(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next !=null){
            last = last.next;
        }
        last.next = node;
        node.prev =last;

    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.val== value){
                return node;
            }
            node = node.next;
        }
        
        return null;
    }
    public void insert(int after, int val){
        Node p = find(after);
        if(p==null){
           System.out.println("does not exist");
           return; 
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next =node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }

    }
    public void display(){
        Node node = head;
        while (node != null) {
            System.out.println(node.val + " -> ");
            node = node.next;
        }
        System.out.println();
    }
    public void displayRev(){
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.println(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse order");
        while(last != null){
            System.out.println(last.val + " -> ");
            last = last.prev;
        }
    }

    
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertAtFirst(2);
        list.insertAtFirst(4);
        list.insertAtFirst(30);
        list.insertAtFirst(81);
        list.insertAtLastt(99);
        // list.insert(3,65 );//issue
        list.display();
        list.displayRev();
    }
    
}
