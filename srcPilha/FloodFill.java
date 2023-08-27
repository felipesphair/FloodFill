public class FloodFill {
    private int[][] image;

    public FloodFill(int[][] image) {
        this.image = image;
    }

    public void floodFill(int row, int col, int oldValue, int newValue, LinkedStack stack) {
        int numRows = image.length;
        int numCols = image[0].length;

        if (row < 0 || row >= numRows || col < 0 || col >= numCols || image[row][col] != oldValue) {
            return;
        }

        stack.push(row, col);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            row = current.row;
            col = current.col;

            if (row < 0 || row >= numRows || col < 0 || col >= numCols || image[row][col] != oldValue) {
                continue;
            }

            image[row][col] = newValue;

            printMatrix(); // Print the matrix after each change

            stack.push(row + 1, col);
            stack.push(row - 1, col);
            stack.push(row, col + 1);
            stack.push(row, col - 1);
        }
    }

    public void printMatrix() {
        for (int[] row : image) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println(); // Add an extra newline for separation
    }
}
