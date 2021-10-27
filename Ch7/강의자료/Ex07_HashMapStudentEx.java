package Ch7.강의자료;

import java.util.*;

class Ex07_Student {
    int id;
    String tel;

    public Ex07_Student(int id, String tel) {
        this.id = id; this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getTel() {
        return tel;
    }
}

public class Ex07_HashMapStudentEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Ex07_Student> map = new HashMap<String, Ex07_Student>();
        map.put("황기태", new Ex07_Student(1, "010-111-1111"));
        map.put("이재문", new Ex07_Student(2, "010-222-2222"));
        map.put("김남윤", new Ex07_Student(3, "010-333-3333"));

        while(true) {
            System.out.print("검색할 이름? ");
            String name = scanner.nextLine();
            if(name.equals("exit"))
                break;

            Ex07_Student student = map.get(name);
            if(student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
        }
        scanner.close();
    }
}
