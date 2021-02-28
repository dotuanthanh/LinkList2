public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        this.head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

//    public void add(int index, Object data) {
//        Node temp = head;
//        Node holder = new Node(data);
//        for (int i = 0; (i < index - 1) && (temp.next != null); i++) {
//            temp = temp.next;
//        }
//        temp.next = holder;
//        holder.next.next = holder;
//        numNodes++;
//    }


        public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
       temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public void AddLast(Object data) {
        Node temp = head;
        Node holder = new Node(data);
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        temp.next = holder;
        holder.next = null;
    }

    public Node remove(int index) {
        Node temp = head;
        for(int i=0; i < index-1 && temp.next != null; i++){
            temp = temp.next;
        }
        return temp;
    }
    public int indexOf(Object  data){
        Node  temp =head ;
        Node a;
        for(int i=0; i < numNodes-1 && temp.next != null; i++){
            temp=temp.next;
            if(temp.getData()==data){
                return i;
            }
        }
        return -1;
    }
    public Node getFirst(){
        return head;
    }
    public Node getLast(){
        Node temp =  head ;
        for(int i=0; i < numNodes-1 && temp.next != null; i++){
            temp =temp.next;
        }
        return temp;
    }
    public boolean Contains(Object data){
        Node temp =head ;
        for(int i=0; i < numNodes-1 && temp.next != null; i++){
           if(head.next.getData()==data){
               return true;
           }
        }
        return  false;
    }
}