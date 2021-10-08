package Ch3.자료실;
import java.util.Scanner;

public class Prac14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sub="";
        String course[]={"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int score[]={95,88,76,62,55};

         do {
             System.out.print("과목 이름>> ");
             sub=scanner.next();

            for(int i=0;i<course.length && !sub.equals("그만");i++)
            {
                if(sub.equals(course[i])) {
                    System.out.println(course[i]+"의 점수는 "+score[i]);
                    break;
                }
                else if(i== course.length-1){
                    System.out.println("없는 과목입니다.");
                }
            }
        } while(!sub.equals("그만"));
    }
}
