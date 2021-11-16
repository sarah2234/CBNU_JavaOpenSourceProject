package Ch10.자료실;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Practice02 extends JFrame {
    public Practice02() {
        setTitle("실습문제 2번");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.setBackground(Color.GREEN);
        MyMouseAdapter mouseAdapter = new MyMouseAdapter();
        container.addMouseListener(mouseAdapter);
        container.addMouseMotionListener(mouseAdapter);
        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter {
        public void mouseDragged(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.YELLOW);
        }

        public void mouseReleased(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Practice02();
    }
}
