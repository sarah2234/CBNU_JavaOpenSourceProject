package Ch9.강의자료;

import javax.swing.*;

public class Ex01_MyFrame extends JFrame {
    public Ex01_MyFrame() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300); // 프레임 크기 설정
        setVisible(true); // 프레임 출력
    }

    public static void main(String[] args) {
        Ex01_MyFrame frame = new Ex01_MyFrame();
    }
}
