package structures;

public class Queue implements GenericList {
    private Coordinate[] queueArray;
    private int front, rear, itemCount;

    public Queue(int capacity) {
        queueArray = new Coordinate[capacity];
        front = 0;
        rear = -1;
        itemCount = 0;
    }

    public void enqueue(int row, int col) {
        if (itemCount < queueArray.length) {
            if (rear == queueArray.length - 1)
                rear = -1;
            queueArray[++rear] = new Coordinate(row, col);
            itemCount++;
        }
    }

    public Coordinate dequeue() {
        Coordinate coords = queueArray[front++];
        if (front == queueArray.length)
            front = 0;
        itemCount--;
        return coords;
    }

    public boolean isEmpty() {
        return (itemCount == 0);
    }

    @Override
    public void push(int row, int col) {
        enqueue(row, col);
    }

    @Override
    public Coordinate  pop() {
        return dequeue();
    }

    @Override
    public void push(Coordinate item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }
}
