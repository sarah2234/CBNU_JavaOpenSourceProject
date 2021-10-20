package Ch6.강의자료;

public class Ex06_AutoBoxingUnboxingEx {
    public static void main(String[] args) {
        int n = 10;
        Integer intObject = n; // auto boxing (Integer intObject = Integer.valueOf(10)
        System.out.println("intObject = " + intObject);

        int m = intObject + 10; // auto unboxing (int m = intObject.intValue() + 10
        System.out.println("m = " + m);
    }
}
