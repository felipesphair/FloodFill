

public class FloodFillApp {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,1,1,1,1,1,1,1,0},
            {1,1,1,1,1,1,1,1,0,1},
            {1,1,1,1,1,1,1,0,1,1},
            {1,1,1,1,1,1,0,1,1,1},
            {1,1,1,1,1,0,1,1,1,1},
            {1,1,1,1,0,1,1,1,1,1},
            {1,1,1,0,1,1,1,1,1,1},
            {1,1,0,1,1,1,1,1,1,1},
            {1,0,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1}
        };

        FloodFill floodFillApp = new FloodFill(image);
        LinkedQueue queue = new LinkedQueue(image.length * image[0].length);

        int targetRow = 0;
        int targetCol = 0;
        int newValue = 2;

        System.out.println("Original Matrix:");
        floodFillApp.printMatrix();

        floodFillApp.floodFill(targetRow, targetCol, image[targetRow][targetCol], newValue, queue);

        System.out.println("\nFinal Updated Matrix:");
        floodFillApp.printMatrix();
    }
}
