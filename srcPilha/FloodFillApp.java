public class FloodFillApp {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };


        FloodFill floodFillApp = new FloodFill(image);
        LinkedStack stack = new LinkedStack();

        int targetRow = 0;
        int targetCol = 0;
        int newValue = 2;

        System.out.println("Original Matrix:");
        floodFillApp.printMatrix();

        floodFillApp.floodFill(targetRow, targetCol, image[targetRow][targetCol], newValue, stack);
    }
}
