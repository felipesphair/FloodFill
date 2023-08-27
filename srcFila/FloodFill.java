public class FloodFill {
    private int[][] image;

    public FloodFill(int[][] image) {
        this.image = image;
    }

    public void floodFill(int row, int col, int oldValue, int newValue, LinkedQueue queue) {
        int numRows = image.length;
        int numCols = image[0].length;

        if (row < 0 || row >= numRows || col < 0 || col >= numCols || image[row][col] != oldValue) {
            return;
        }

        queue.enqueue(row, col);

        while (!queue.isEmpty()) {
            Node current = queue.dequeue();
            row = current.row;
            col = current.col;

            if (row < 0 || row >= numRows || col < 0 || col >= numCols || image[row][col] != oldValue) {
                continue;
            }

            image[row][col] = newValue;
            printMatrix();

            queue.enqueue(row + 1, col);
            queue.enqueue(row - 1, col);
            queue.enqueue(row, col + 1);
            queue.enqueue(row, col - 1);
        }
    }

    public void printMatrix() {
        for (int[] row : image) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
