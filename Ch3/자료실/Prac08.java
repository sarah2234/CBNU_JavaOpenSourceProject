package Ch3.자료실;
import java.util.Scanner;

public class Prac08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("정수 몇 개? ");
        int n=scanner.nextInt();
        int array[]=new int[n];

        for(int i=0, temp=i;i<n;i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    i = temp;
                } else if (j + 1 == i) {
                    temp = i;
                }
            }
        }

        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
            if((i+1)%10==0) {
                System.out.println();
            }
        }
    }
}
