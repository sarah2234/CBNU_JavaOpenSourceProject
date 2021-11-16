package Ch10.강의자료;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex03_AnonymousClassListener extends JFrame {
    public Ex03_AnonymousClassListener() {
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        c.add(btn);
        btn.addActionListener(new ActionListener() { // anonymous class
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
                setTitle(b.getText());
            }
        });
        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String [] args) {
        new Ex03_AnonymousClassListener();
    }
}
