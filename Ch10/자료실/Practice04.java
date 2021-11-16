package Ch10.자료실;

import Ch10.강의자료.Ex08_FlyingTextEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Practice04 extends JFrame {
    public Practice04() {
        setTitle("실습문제 4번");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JLabel jLabel = new JLabel("Love Java");
        container.add(jLabel);
        container.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_LEFT) {
                    String text = jLabel.getText();
                    text = text.substring(1) + text.charAt(0);
                    jLabel.setText(text);
                }
            }
        });
        container.setFocusable(true);
        container.requestFocus();
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Practice04();
    }
}
