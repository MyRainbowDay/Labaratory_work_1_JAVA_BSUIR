package epam.tasks.task4.run.task;

import epam.tasks.task3.function.values.FunctionValues;
import epam.tasks.task4.array.Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int N = scanner.nextInt();

        Array.createRandomArray(N);
        Array.findPrimeNumbersInArray(Array.array);
    }
}
