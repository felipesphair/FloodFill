package Fill;

public class Matrix {
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

    public int heigth = 10;
    public int width = 10;

    public Matrix(){}
    public Matrix(int[][] image){
        this.image = image;
        heigth = image.length;
        width = image[0].length;
    }

    public void printMatrix() {
        for (int[] row : image) {
            for (int value : row) {
                Color color = Color.getColorByIndex(value);
                System.out.print(color);
                System.out.print(value + " ");
                System.out.print(Color.RESET);
            }
            System.out.println();
        }
        System.out.println();
        try {
            Thread.sleep(110);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    public int[][] getImage() {
        return image;
    }
    
    public void setImage(int[][] image) {
        this.image = image;
    }
    
    public void setPixel(int x, int y, int value){
        image[x][y] = value;
    }
    
    public int getPixel(int x, int y){
        return image[x][y];
    }
}
