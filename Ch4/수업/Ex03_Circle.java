package Ch4.수업;

public class Ex03_Circle {
    int radius;
    String name;
    public Ex03_Circle() {
        radius = 1;
        name = "";
    }
    public Ex03_Circle(int r, String n) {
        radius = r;
        name = n;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Ex03_Circle pizza = new Ex03_Circle(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex03_Circle donut = new Ex03_Circle();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
