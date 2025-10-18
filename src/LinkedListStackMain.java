public class LinkedListStackMain {
    public static void main(String[] args){
        LinkedListStack<String> myLL = new LinkedListStack<>();
        myLL.push("We Could Be The Same");
        myLL.push("Fairytale");
        myLL.push("Another Love");
        myLL.push("Lost on You");
        myLL.push("Hello");
        myLL.pop();
        myLL.pop();

        myLL.printStack();
    }
}
