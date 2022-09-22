package epam.tasks.task3.run.task;

import epam.tasks.task2.coordinate.grid.CoordinateGridSolver;
import epam.tasks.task3.function.values.FunctionValues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter h: ");
        double h = scanner.nextDouble();

        FunctionValues.printAllFunctionValues(a,b,h);
    }
}
