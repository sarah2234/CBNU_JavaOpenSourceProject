package Ch4.강의자료;

public class Ex12_CurrencyConverter {
    private static double rate;

    public static double toDollar(double won) {
        return won/rate;
    }

    public static double toKWR(double dollar) {
        return dollar * rate;
    }

    public static void setRate(double r) {
        rate = r;
    }
}
