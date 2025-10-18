public class LinkedListStack <T>{
    public class Node1{
        T data;
        Node1 next;
        Node1(T data){
            this.data = data;
            this.next = null;
        }
    }
    private Node1 top;
    private int size;
    public LinkedListStack(){
        this.top= null;
        this.size = 0;
    }
    public void push(T item){
        Node1 newNode1 = new Node1(item);
        newNode1.next = top;
        top = newNode1;
        size++;
    }
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
    public void printStack() {
        Node1 current = top;
        System.out.print("TOP -> ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
