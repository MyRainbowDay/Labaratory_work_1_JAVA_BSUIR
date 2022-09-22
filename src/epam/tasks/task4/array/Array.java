package epam.tasks.task4.array;

import java.util.Random;

public class Array {
    public static int[] array;
    public static void createRandomArray(int N) {
        Random random = new Random();
        array = new int[N];

        for (int i = 0; i < N; i++)
            array[i] = random.nextInt(100 + 1); // [100,200]
    }

    public static boolean checkIsPrimeNumber(int number) {
        if (number < 2)
            return false;
        double s = Math.sqrt(number);
        for (int i = 2; i <= s; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void findPrimeNumbersInArray(int[] arr) {
        for (int j : arr)
            if (checkIsPrimeNumber(j))
                System.out.println(j);
    }
}
