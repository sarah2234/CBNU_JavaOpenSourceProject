package Ch9.자료실;

import javax.swing.*;
import java.awt.*;

public class Practice02 extends JFrame {
    public Practice02() {
        setTitle("9장 실습 문제(BorderLayout)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료 시 프로세스도 종료
        Container container = getContentPane();

        container.setLayout(new BorderLayout(5, 7)); // awt
        container.add(new JButton("North"), BorderLayout.NORTH);
        container.add(new JButton("West"), BorderLayout.WEST);
        container.add(new JButton("Center"), BorderLayout.CENTER);
        container.add(new JButton("East"), BorderLayout.EAST);
        container.add(new JButton("South"), BorderLayout.SOUTH);

        setSize(600, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Practice02();
    }
}
