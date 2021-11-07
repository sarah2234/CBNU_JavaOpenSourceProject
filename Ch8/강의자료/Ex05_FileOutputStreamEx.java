package Ch8.강의자료;

import java.io.*;

public class Ex05_FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7,51,3,4,-1,24};
        try {
            FileOutputStream fout = new FileOutputStream(".\\Ch8\\강의자료\\test.out");
            for(int i=0; i<b.length; i++)
                fout.write(b[i]);
            fout.close();
        } catch(IOException e) {
            System.out.println( ".\\Ch8\\강의자료\\test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요");
            return;
        }
        System.out.println(".\\Ch8\\강의자료\\test.out을 저장하였습니다.");
    }
}

