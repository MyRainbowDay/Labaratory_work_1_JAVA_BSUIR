package epam.tasks.task9.objects;

import java.awt.Color;
import java.util.ArrayList;

public class Basket {

    public ArrayList<Ball> balls;
    public double weight;

    public Basket(ArrayList<Ball> balls)
    {
        this.balls = new ArrayList<>();
        this.weight = 0;

        for(Ball ball : balls)
        {
            this.balls.add(ball);
        }

    }

    public double BallWeight()
    {
        for(Ball ball: balls)
        {
            weight += ball.weight;
        }

        return weight;
    }

    public int NumberOfBlueBalls()
    {
        int count = 0;

        for(Ball ball: balls)
        {
            if(ball.color == Color.BLUE)
            {
                count++;
            }
        }

        return count;
    }
}