/*
Write a program to demonstrate any event handling
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p20piyu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 100, 30);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        };

        button.addActionListener(actionListener);
        frame.getContentPane().add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
