package epam.tasks.task9.run.task;

import epam.tasks.task9.objects.Ball;
import epam.tasks.task9.objects.Basket;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
                new Ball(Color.BLACK, 0.3),
                new Ball(Color.BLUE, 0.5),
                new Ball(Color.BLUE, 0.2),
                new Ball(Color.GRAY, 0.2),
                new Ball(Color.GREEN, 0.2)
        ));

        Basket basket = new Basket(balls);
        System.out.print("The weight of the balls is " + basket.BallWeight() +
                ". Number of blue balls " + basket.NumberOfBlueBalls() + ".");
    }
}
