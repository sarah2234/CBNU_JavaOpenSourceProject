package Ch4.수업;

public class Ex09_GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null; // a가 가리키던 "Good" 객체는 가비지가 됨
        d = c;
        c = null;
    }
}
