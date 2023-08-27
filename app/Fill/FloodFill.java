package Fill;

import structures.Coordinate;
import structures.GenericList;

public class FloodFill {
    private Matrix image;
    int numRows;
    int numCols;

    public FloodFill(Matrix image) {
        this.image = image;
        numRows = image.heigth;
        numCols = image.width;
    }

    public void floodFill(int row, int col, int oldValue, int newValue, GenericList list) { // Generic Type?

        if (row < 0 || row >= numRows || col < 0 || col >= numCols || image.getPixel(row, col) != oldValue) {
            return;
        }

        list.push(row, col);

        while (!list.isEmpty()) {
            Coordinate current = list.pop();
            row = current.row;
            col = current.col;

            if (row < 0 || row >= numRows || col < 0 || col >= numCols || image.getPixel(row, col) != oldValue) {
                continue;
            }

            image.setPixel(row, col, newValue);

            image.printMatrix(); // Print the matrix after each change
            list.push(row + 1, col);
            list.push(row - 1, col);
            list.push(row, col + 1);
            list.push(row, col - 1);
        }
    }


}
