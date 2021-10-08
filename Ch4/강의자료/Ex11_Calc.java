package Ch4.강의자료;

public class Ex11_Calc {
    public static int abs(int a) {
        if(a >= 0) {
            return a;
        }
        else {
            return -a;
        }
    }

    public static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if(a < b) {
            return a;
        }
        else {
            return b;
        }
    }
}
