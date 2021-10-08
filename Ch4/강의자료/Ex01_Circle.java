package Ch4.강의자료;

public class Ex01_Circle {
    int radius;
    String name;
    public Ex01_Circle() {}
    public double getArea() {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Ex01_Circle pizza;
        pizza = new Ex01_Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex01_Circle donut = new Ex01_Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
