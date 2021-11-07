package Ch9.강의자료;

import javax.swing.*;
import java.awt.*;

public class Ex02_ContentPaneEx extends JFrame { // JFrame: swing
    public Ex02_ContentPaneEx() {
        setTitle("ContentPane과 JFrame"); // swing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // swing
        Container contentPane = getContentPane(); // awt
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("OK")); // JButton: swing, add(): awt
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));
        setSize(300, 150); // swing
        setVisible(true); // swing
    }

    public static void main(String[] args) {
        new Ex02_ContentPaneEx();
    }
}

