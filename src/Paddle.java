import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {
    int id;
    int yVelocity;
    int speed = 10;

    Paddle(int x, int y, int PADDE_WIDTH, int PADDE_HEIGHT, int id) {
        super(x, y, PADDE_WIDTH, PADDE_HEIGHT);
        this.id = id;

    }

    public void keyPressed(KeyEvent event) {
        switch (id) {
            case 1:
                if (event.getKeyCode() == KeyEvent.VK_W) {
                    setYDirectional(-speed);
                    move();
                }
                if (event.getKeyCode() == KeyEvent.VK_S) {
                    setYDirectional(speed);
                    move();
                }
                break;
            case 2:
                if (event.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirectional(-speed);
                    move();
                }
                if (event.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirectional(speed);
                    move();
                }
                break;
        }
    }

    public void keyReleased(KeyEvent event) {
        switch (id) {
            case 1:
                if (event.getKeyCode() == KeyEvent.VK_W) {
                    setYDirectional(0);
                    move();
                }
                if (event.getKeyCode() == KeyEvent.VK_S) {
                    setYDirectional(0);
                    move();
                }
                break;
            case 2:
                if (event.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirectional(0);
                    move();
                }
                if (event.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirectional(0);
                    move();
                }
                break;
        }
    }

    public void setYDirectional(int yDirectional) {
        yVelocity = yDirectional;
    }

    public void move() {
        y = y + yVelocity;
    }

    public void draw(Graphics g) {
        if (id == 1)
            g.setColor(Color.BLUE);
        else
            g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }
}

