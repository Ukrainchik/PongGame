import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();
        int randomXDirectional = random.nextInt(2);
        if (randomXDirectional == 0)
            randomXDirectional--;
        setXDirectional(randomXDirectional * initialSpeed);

        int randomYDirectional = random.nextInt(2);
        if (randomYDirectional == 0)
            randomYDirectional--;
        setYDirectional(randomYDirectional * initialSpeed);


    }

    public void setXDirectional(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirectional(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, height, width);
    }

}
