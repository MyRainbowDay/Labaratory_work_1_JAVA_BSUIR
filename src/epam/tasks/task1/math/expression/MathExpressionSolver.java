package epam.tasks.task1.math.expression;
import java.lang.Math.*;

public class MathExpressionSolver {
    public static double solveExpression(double x, double y) {
        double numerator = Math.pow(Math.sin(x + y), 2) + 1;
        double denominator = 2 + Math.abs(x - ((2 * x) / (x * x * y * y + 1)));
        return (numerator / denominator + x);
    }
}
