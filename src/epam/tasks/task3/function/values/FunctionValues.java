package epam.tasks.task3.function.values;

public class FunctionValues {
    public static void printAllFunctionValues(double a, double b, double h) {
        double x = a;

        while (x <= b) {
            System.out.println(x + "|" + Math.tan(x));
            x += h;
        }
    }
}
