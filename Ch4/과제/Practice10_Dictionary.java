package Ch4.과제;
import java.util.Scanner;

public class Practice10_Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};

    private static String kor2Eng(String word) {
        int i = 0;
        for(; i < kor.length; i++) {
            if(word.equals(kor[i])) break;
            else if(i == kor.length -1) return "none";
        }
        return eng[i];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글 단어? ");
            String finding = scanner.next();
            if(finding.equals("그만")) break;
            String answer = Practice10_Dictionary.kor2Eng(finding);
            if(answer.equals("none"))
                System.out.println(finding + "은 저의 사전에 없습니다.");
            else System.out.println(finding + "은 " + answer);
        }
        scanner.close();
    }
}
