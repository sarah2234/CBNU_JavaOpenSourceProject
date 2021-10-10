package Ch5.자료실;

import java.util.Scanner;

class Practice06_Point {
    private int x, y;

    public Practice06_Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    protected void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Practice06_ColorPoint extends Practice06_Point {
    private String color;

    public Practice06_ColorPoint() {
        super(0, 0);
        color = "BLACK";
    }

    public Practice06_ColorPoint(int x, int y) {
        super(x, y);
        color = "BLACK";
    }

    public void setXY(int x, int y) {
        super.move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color + "색의 (" + getX() + ", " + getY() + ")의 점";
    }

    public static void main(String[] args) {
        Practice06_ColorPoint zeroPoint = new Practice06_ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");

        Practice06_ColorPoint cp = new Practice06_ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}
