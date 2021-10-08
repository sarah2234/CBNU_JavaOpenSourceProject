package Ch4.강의자료;

public class Ex10_AccessEx {
    public static void main(String[] args) {
        Ex10_Sample aClass = new Ex10_Sample();
        aClass.a = 10;
        //aClass.b = 10; // 컴파일 오류: b의 접근 지정자는 private이므로 접근할 수 없다.
        aClass.c = 10;
    }
}
