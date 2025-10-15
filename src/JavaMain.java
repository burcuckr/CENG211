public class JavaMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(12);
        myLinkedList.append(7);
        myLinkedList.append(9);
        myLinkedList.printList();
        myLinkedList.deleteVal(7);
        myLinkedList.printList();
    }
}
