
import java.util.Scanner;

import Fill.FloodFill;
import Fill.Matrix;
import structures.GenericList;
import structures.Queue;
import structures.Stack;

public class main {
    public static void main(String[] args) {

        int[][] circle = {
            {0,0,1,1,1,1,1,0,0,0},
            {0,1,0,0,0,0,0,1,0,0},
            {1,0,0,0,0,0,0,0,1,0},
            {1,0,0,0,0,0,0,0,1,0},
            {1,0,0,0,0,0,0,0,1,0},
            {1,0,0,0,0,0,0,0,1,0},
            {1,0,0,0,0,0,0,0,1,0},
            {0,1,0,0,0,0,0,1,0,0},
            {0,0,1,1,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}
        };

        int[][] triangle = {
            {0,0,0,0,0,1,0,0,0,0},
            {0,0,0,0,1,1,1,0,0,0},
            {0,0,0,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,0},
            {0,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}
        };
        
        int[][] cross = {
            {1,0,0,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,1,1,0},
            {0,1,1,0,0,0,1,1,0,0},
            {0,0,1,1,0,1,1,0,0,0},
            {0,0,0,1,1,1,0,0,0,0},
            {0,0,0,0,1,1,1,0,0,0},
            {0,0,0,1,1,0,1,1,0,0},
            {0,0,1,1,0,0,0,1,1,0},
            {0,1,1,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,0,0,1}
        };
        
        int[][][] patterns = {
           circle,
           cross,
           triangle
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha qual padrão gostaria de usar:");
        System.out.println("1. Circulo | 2. Cruz | 3. Triangulo");
        System.out.print("Entre com sua Escolha: ");

        int choice = scanner.nextInt();
        Matrix matrix;

        if (choice >= 1 && choice <= patterns.length) {
            int[][] chosenPattern = patterns[choice - 1];
            matrix = new Matrix(chosenPattern);
            System.out.println("Padrão Escolhido:");
            matrix.printMatrix();
        } else {
            System.out.println("Escolha Inválida, usando o padrão:");
            matrix = new Matrix();
        }

        System.out.print("Coordenada 'X' para iniciar: ");
        int targetCol = scanner.nextInt();

        System.out.print("Coordenada 'Y' para iniciar: ");
        int targetRow = scanner.nextInt();

        System.out.println("Escolha o modelo de preenchimento");
        System.out.println("Padrão [0]: Pilha (Stack)");
        System.out.println("[1]: Fila (Queue)");
        System.out.print("Entre com sua Escolha: ");
        
        int placementChoice = scanner.nextInt();

        scanner.close();

        FloodFill floodFillApp = new FloodFill(matrix);
        
        GenericList list;
        switch(placementChoice) {
            case 1:
                list = new Queue(matrix.heigth*matrix.width);
            break;
            default:
                list = new Stack(matrix.heigth*matrix.width);
            break;
        }
        int newValue = 2;


        floodFillApp.floodFill(targetRow, targetCol, matrix.getPixel(targetRow, targetCol), newValue, list);

        System.out.println("\n Ultimo Quadro:");
        matrix.printMatrix();
    }
   
}
