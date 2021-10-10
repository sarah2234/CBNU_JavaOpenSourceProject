package Ch5.자료실;

interface Practice14_Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다.");
        draw();
    }
}

class Practice14_Circle implements Practice14_Shape {
    int x;
    public Practice14_Circle(int x) {
        this.x = x;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + x + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI * x * x;
    }
}

class Practice14_Oval implements Practice14_Shape {
    int x, y;
    public Practice14_Oval(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return PI * x * y;
    }
}

class Practice14_Rect implements Practice14_Shape {
    int x, y;

    public Practice14_Rect(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(x + "x" + y + " 크기의 사각형입니다.");
    }

    @Override
    public double getArea() {
        return x * y;
    }
}

public class Practice14 {
    public static void main(String[] args) {
        Practice14_Shape[] list = new Practice14_Shape[3];
        list[0] = new Practice14_Circle(10);
        list[1] = new Practice14_Oval(20, 30);
        list[2] = new Practice14_Rect(10, 40);
        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
    }
}
