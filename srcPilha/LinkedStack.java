public class LinkedStack {
    private Node[] stackArray;
    private int top;

    public LinkedStack() {
        stackArray = new Node[100];
        top = -1;
    }

    public void push(int row, int col) {
        stackArray[++top] = new Node(row, col);
    }

    public Node pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
