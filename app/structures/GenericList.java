package structures;

public interface GenericList {
    void push(Coordinate item);
    void push(int row, int col);
    Coordinate pop();
    boolean isEmpty();
}
