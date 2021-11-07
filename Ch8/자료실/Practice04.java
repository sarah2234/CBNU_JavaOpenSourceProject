package Ch8.자료실;

import java.io.*;

public class Practice04 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("c:\\windows\\system.ini");
            int c, num = 1;
            System.out.print(num + ": ");
            num++;
            while((c = fileReader.read()) != -1) {
                if((char)c == '\n') {
                    System.out.println();
                    System.out.print(num + ": ");
                    num++;
                }
                else {
                    System.out.print((char) c);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
