package Ch7.자료실;

import java.util.*;

public class Practice08_HashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> program = new HashMap<String, Integer>();
        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = scanner.next();
            if(name.equals("그만")) break;
            int point = scanner.nextInt();

            if(program.containsKey(name) == false) {
                program.put(name, point);
            }
            else {
                int result = program.get(name);
                program.replace(name, point + result);
            }

            Iterator<String> keys = program.keySet().iterator();
            while(keys.hasNext()) {
                String key = keys.next();
                System.out.print("(" + key + ", " + program.get(key) + ") ");
            }
            System.out.println();
        }
    }
}
