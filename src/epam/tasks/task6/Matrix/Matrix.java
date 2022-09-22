package epam.tasks.task6.Matrix;

import java.util.Scanner;

public class Matrix {
    public static int N = 0;
    public static int[][] Matrix = null;
    private static int[] Array = null;

    public static void enterSizeOfMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        N = scanner.nextInt();
    }

    public static void fillMatrix() {
        Scanner scanner = new Scanner(System.in);
        Array = new int[N];
        System.out.print("Enter the matrix elements: ");
        for (int i = 0; i < N; i++)
            Array[i] = scanner.nextInt();

        Matrix = new int[N][N];
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < N - i)
                    Matrix[i][j] = Array[i + j];
                else
                    Matrix[i][j] = Array[i + j - N];
            }
        }
    }

    public static void printMatrix() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
