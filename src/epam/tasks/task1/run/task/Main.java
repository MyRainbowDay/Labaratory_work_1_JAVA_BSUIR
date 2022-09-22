package epam.tasks.task1.run.task;

import epam.tasks.task1.math.expression.MathExpressionSolver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = scanner.nextDouble();
        System.out.print("Enter Y: ");
        double y = scanner.nextDouble();

        System.out.println("Expression result: " + MathExpressionSolver.solveExpression(x,y));
    }
}
