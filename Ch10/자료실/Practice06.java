package Ch10.자료실;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practice06 extends JFrame {
    public Practice06() {
        setTitle("실습문제 6번");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);
        JLabel jLabel = new JLabel("c");
        jLabel.setLocation(100, 100);
        jLabel.setSize(10, 10);
        container.add(jLabel);
        container.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point location = jLabel.getLocation();
                if(Math.abs(e.getX() - location.x) <= 20 && Math.abs(e.getY() - location.y) <= 20) {
                    int x = (int)(Math.random() * container.getWidth());
                    int y = (int)(Math.random() * container.getHeight());
                    jLabel.setLocation(x, y);
                }
            }
        });
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Practice06();
    }
}
