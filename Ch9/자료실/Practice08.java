package Ch9.자료실;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Practice08 extends JFrame {
    public Practice08() {
        setTitle("9장 실습 문제(GUI)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.GRAY);
        panel1.add(new JButton("열기"));
        panel1.add(new JButton("닫기"));
        panel1.add(new JButton("나가기"));
        container.add(panel1, BorderLayout.NORTH);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setBackground(Color.ORANGE);
        panel3.add(new JButton("Word Input"));
        panel3.add(new JTextField("", 15));
        container.add(panel3 , BorderLayout.SOUTH);

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        for(int i = 0; i < 10; i++) {
            JLabel jLabel = new JLabel("*");
            int x = (int) (Math.random() * 200) + 50;
            int y = (int) (Math.random() * 200) + 50;
            jLabel.setForeground(Color.RED);
            jLabel.setLocation(x, y);
            jLabel.setSize(10, 10);
            panel2.add(jLabel);
        }
        container.add(panel2, BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Practice08();
    }
}
