package structures;

public class Stack implements GenericList {
    private Coordinate[] stackArray;
    private int top;

    public Stack(int capacity) {
        stackArray = new Coordinate[capacity];
        top = -1;
    }

    public void push(int row, int col) {
        stackArray[++top] = new Coordinate(row, col);
    }

    public Coordinate pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public void push(Coordinate item) {
        stackArray[++top] = item;
    }
}
