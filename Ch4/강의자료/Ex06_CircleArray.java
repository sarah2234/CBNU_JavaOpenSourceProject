package Ch4.강의자료;

public class Ex06_CircleArray {
    public static void main(String[] args) {
        Ex06_Circle[] c = new Ex06_Circle[5];

        for(int i=0; i<c.length; i++)
            c[i] = new Ex06_Circle(i);

        for(int i=0; i<c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }
}
