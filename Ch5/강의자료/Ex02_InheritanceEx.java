package Ch5.강의자료;

class Ex02_Person {
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

class Ex02_Student extends Ex02_Person {
    public void set() {
        age = 30; // 슈퍼 클래스의 디폴트 멤버 접근 가능
        name = "홍길동"; // 슈퍼 클래스의 public 멤버 접근 가능
        height = 175; // 슈퍼 클래스의 protected 멤버 접근 가능
// weight = 99; // 오류. 슈퍼 클래스의 private 접근 불가
        setWeight(99); // private 멤버 weight은 setWeight()으로 간접 접근
    }
}

public class Ex02_InheritanceEx {
    public static void main(String[] args) {
        Ex02_Student s = new Ex02_Student();
        s.set();
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.height);
        System.out.println(s.getWeight());
    }
}
