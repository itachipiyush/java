/*
Write program that uses swings to display combination of RGB using 3 scrollbars.
 */
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class p21piyu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB Combination");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSlider redSlider = new JSlider(0, 255, 0);
        JSlider greenSlider = new JSlider(0, 255, 0);
        JSlider blueSlider = new JSlider(0, 255, 0);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel redLabel = new JLabel("Red: 0");
        JLabel greenLabel = new JLabel("Green: 0");
        JLabel blueLabel = new JLabel("Blue: 0");

        JLabel colorLabel = new JLabel();
        colorLabel.setOpaque(true);
        colorLabel.setBackground(Color.BLACK);

        ChangeListener changeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int redValue = redSlider.getValue();
                int greenValue = greenSlider.getValue();
                int blueValue = blueSlider.getValue();

                Color color = new Color(redValue, greenValue, blueValue);
                colorLabel.setBackground(color);

                redLabel.setText("Red: " + redValue);
                greenLabel.setText("Green: " + greenValue);
                blueLabel.setText("Blue: " + blueValue);
            }
        };

        redSlider.addChangeListener(changeListener);
        greenSlider.addChangeListener(changeListener);
        blueSlider.addChangeListener(changeListener);

        panel.add(redLabel);
        panel.add(redSlider);
        panel.add(greenLabel);
        panel.add(greenSlider);
        panel.add(blueLabel);
        panel.add(blueSlider);
        panel.add(colorLabel);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
