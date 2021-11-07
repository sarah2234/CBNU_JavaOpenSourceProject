package Ch8.강의자료;

import java.io.*;
import java.util.Scanner;

public class Ex07_BufferedIOEx {
    public static void main(String[] args) {
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader(".\\Ch8\\강의자료\\test2.txt");
            BufferedOutputStream out = new
                    BufferedOutputStream(System.out, 5);
            while ((c = fin.read()) != -1) {
                out.write(c);
            }

            new Scanner(System.in).nextLine();
            out.flush();
            fin.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

