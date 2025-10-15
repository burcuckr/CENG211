public class LinkedList {
    Node head; //Pointer for the head LinkedList
    //consturctor
    public LinkedList(){
        this.head = null; //initally, list will be empty
    }
    //appending a Node at the end of the List
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head; //temporary variable
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode; //connect the last node
    }
    public void prepend(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //Delete node w.r.t. given data
    public void deleteVal(int data){
        if(head == null){ //If it is empty
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null && current.next.data != data){
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
        }
    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

}
