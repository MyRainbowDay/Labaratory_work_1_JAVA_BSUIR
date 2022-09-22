package epam.tasks.task2.coordinate.grid;

public class CoordinateGridSolver {
    public static boolean checkCoordinatesBelongs(double x, double y) {
        if (x <= 4 && x >= -4 && y <= 5 && y >= -3)
            return true;
        else if (y >= -3 && y <= 0 && x <= 6 && x >= - 6)
            return true;

        return false;
    }
}
