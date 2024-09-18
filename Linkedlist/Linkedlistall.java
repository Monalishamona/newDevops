public class Linkedlistall {
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
    public Linkedlistall(){
        this.size=0;
    }
    public void insertatBegin(int val){
        
        Node node = new Node(val);
        node.next = head;
        head=node;
        if(tail==null){
            head=tail;
        }
        size+=1;

    }
    public void insertatend(int val){
        if(tail==null){
            insertatBegin(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size++;
    }
    public void insert(int val,int index){
        if(index==0){
             insertatBegin(val);
             return;
        }
        if(index==size){
            insertatend(val);
            return;
        }
        Node temp = head;
        for(int i =1; i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next=node;
        size++;

    }
    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.val==val){
                return node;
            }
            node = node.next;

        }
        return null;
    }
    public int deleteFirst(){
        int val = head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node second= get(size-2);
        int val = tail.val;
        tail=second;
        tail.next=null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    public Node get(int index){
        Node node = head;
        for(int i =0; i <index;i++){
            node = node.next;
        }
        return node;
    }
    public static void main(String[] args) {
        Linkedlistall list = new Linkedlistall();
        list.insertatBegin(22);
        list.insertatBegin(54);
        list.insertatBegin(43);
        list.insert(20, 2);
        list.deleteFirst();
        list.insertatend(90);
        list.delete(2);
        list.display();
    }

    
}
