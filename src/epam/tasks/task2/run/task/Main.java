package epam.tasks.task2.run.task;

import epam.tasks.task1.math.expression.MathExpressionSolver;
import epam.tasks.task2.coordinate.grid.CoordinateGridSolver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = scanner.nextDouble();
        System.out.print("Enter Y: ");
        double y = scanner.nextDouble();

        System.out.println("Area result: " + CoordinateGridSolver.checkCoordinatesBelongs(x,y));
    }
}
