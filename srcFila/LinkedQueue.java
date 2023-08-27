public class LinkedQueue {
    private Node[] queueArray;
    private int front, rear, itemCount;

    public LinkedQueue(int capacity) {
        queueArray = new Node[capacity];
        front = 0;
        rear = -1;
        itemCount = 0;
    }

    public void enqueue(int row, int col) {
        if (itemCount < queueArray.length) {
            if (rear == queueArray.length - 1)
                rear = -1;
            queueArray[++rear] = new Node(row, col);
            itemCount++;
        }
    }

    public Node dequeue() {
        Node node = queueArray[front++];
        if (front == queueArray.length)
            front = 0;
        itemCount--;
        return node;
    }

    public boolean isEmpty() {
        return (itemCount == 0);
    }
}
