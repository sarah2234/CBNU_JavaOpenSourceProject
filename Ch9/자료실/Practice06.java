package Ch9.자료실;

import javax.swing.*;
import java.awt.*;

public class Practice06 extends JFrame {
    public Practice06() {
        setTitle("9장 실습 문제(JLabel)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);

        for(int i = 0; i < 10; i++) {
            JLabel jLabel = new JLabel(String.valueOf(i));
            int x = (int) (Math.random() * 200) + 50;
            int y = (int) (Math.random() * 200) + 50;
            jLabel.setBackground(Color.BLUE);
            jLabel.setForeground(Color.white);
            jLabel.setLocation(x, y);
            jLabel.setSize(10, 10);
            jLabel.setOpaque(true);
            container.add(jLabel);
        }

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Practice06();
    }
}
