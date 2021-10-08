package Ch4.자료실;
import java.text.DecimalFormat;

public class Practice06_Circle {
    private double x, y;
    private int radius;

    public Practice06_Circle(double x, double y, int radius) {
        this.x = x;
        this.y =y;
        this.radius = radius;
    }

    public void show() {
        DecimalFormat form = new DecimalFormat("#.#");
        System.out.println("(" + x + ", " + y + ")" + radius);
    }

    public int getRadius() {
        return radius;
    }
}
