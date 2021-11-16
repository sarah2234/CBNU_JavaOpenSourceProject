package Ch10.강의자료;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Ex10_ClickAndDoubleClickEx extends JFrame {
    public Ex10_ClickAndDoubleClickEx() {
        setTitle("Click and DoubleClick 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener());
        setSize(300,200);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            if(e.getClickCount() == 2) {
                int r = (int)(Math.random()*256);
                int g = (int)(Math.random()*256);
                int b = (int)(Math.random()*256);
                Component c = (Component)e.getSource();
                c.setBackground(new Color(r,b,g));
            }
        }
    }

    public static void main(String [] args) {
        new Ex10_ClickAndDoubleClickEx();
    }
}
