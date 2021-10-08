package Ch5.강의자료;

class Ex05_Shape {
    public Ex05_Shape next;
    public Ex05_Shape() {
        next = null;
    }

    public void draw() {
        System.out.println("Shape");
    }
}

class Ex05_Line extends Ex05_Shape {
    public void draw() {
        System.out.println("Line");
    }
}

class Ex05_Rect extends Ex05_Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Ex05_Circle extends Ex05_Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class Ex05_MethodOverridingEx {
    static void paint(Ex05_Shape p) {
        p.draw();

    }
    public static void main(String[] args) {
        Ex05_Line line = new Ex05_Line();
        paint(line);
        paint(new Ex05_Shape());
        paint(new Ex05_Line());
        paint(new Ex05_Rect());
        paint(new Ex05_Circle());
    }
}
