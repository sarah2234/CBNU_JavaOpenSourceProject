package Ch9.자료실;

import javax.swing.*;
import java.awt.*;

public class Practice04 extends JFrame {
    public Practice04() {
        setTitle("9장 실습 문제(GridLayout)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료 시 프로세스도 종료
        Container container = getContentPane();

        container.setLayout(new GridLayout(1, 10)); // awt

        JButton jButton = new JButton(String.valueOf(0));
        jButton.setBackground(Color.RED);
        container.add(jButton);

        jButton = new JButton(String.valueOf(1));
        jButton.setBackground(Color.ORANGE);
        container.add(jButton);

        jButton = new JButton(String.valueOf(2));
        jButton.setBackground(Color.YELLOW);
        container.add(jButton);

        jButton = new JButton(String.valueOf(3));
        jButton.setBackground(Color.GREEN);
        container.add(jButton);

        jButton = new JButton(String.valueOf(4));
        jButton.setBackground(Color.CYAN);
        container.add(jButton);

        jButton = new JButton(String.valueOf(5));
        jButton.setBackground(Color.BLUE);
        container.add(jButton);

        jButton = new JButton(String.valueOf(6));
        jButton.setBackground(Color.MAGENTA);
        container.add(jButton);

        jButton = new JButton(String.valueOf(7));
        jButton.setBackground(Color.BLACK);
        container.add(jButton);

        jButton = new JButton(String.valueOf(8));
        jButton.setBackground(Color.DARK_GRAY);
        container.add(jButton);

        jButton = new JButton(String.valueOf(9));
        jButton.setBackground(Color.GRAY);
        container.add(jButton);

        setSize(600, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Practice04();
    }
}
