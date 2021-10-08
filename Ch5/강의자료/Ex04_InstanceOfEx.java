package Ch5.강의자료;

class Ex04_Person { }
class Ex04_Student extends Ex04_Person { }
class Ex04_Researcher extends Ex04_Person { }
class Ex04_Professor extends Ex04_Researcher { }

public class Ex04_InstanceOfEx {
    static void print(Ex04_Person p) {
        if(p instanceof Ex04_Person)
            System.out.print("Person ");
        if(p instanceof Ex04_Student)
            System.out.print("Student ");
        if(p instanceof Ex04_Researcher)
            System.out.print("Researcher ");
        if(p instanceof Ex04_Professor)
            System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new Ex04_Student());
        System.out.print("new Researcher() ->\t"); print(new Ex04_Researcher());
        System.out.print("new Professor() ->\t"); print(new Ex04_Professor());
    }
}
