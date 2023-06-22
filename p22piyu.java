/*
Write a swing application that uses atleast 5 swing controls
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p22piyu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Controls");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel label = new JLabel("Name:");

        JTextField textField = new JTextField();

        JCheckBox checkBox = new JCheckBox("Subscribe");

        String[] options = {"hello", "world", "Java"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        JButton button = new JButton("Submit");

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                boolean subscribed = checkBox.isSelected();
                String option = comboBox.getSelectedItem().toString();

                JOptionPane.showMessageDialog(null, "Name: " + name
                        + "\nSubscribed: " + subscribed
                        + "\nOption: " + option);
            }
        };

        button.addActionListener(actionListener);

        panel.add(label);
        panel.add(textField);
        panel.add(checkBox);
        panel.add(comboBox);
        panel.add(button);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
