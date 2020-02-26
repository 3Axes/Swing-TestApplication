package feb;
//2.26.20

import javax.swing.*;
import java.awt.*;

public class radialSelections {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radial Selections");
        frame.setDefaultCloseOperation(3);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));

        ButtonGroup group = new ButtonGroup();

        JRadioButton rad1 = new JRadioButton("Radio Button 1");
        JRadioButton rad2 = new JRadioButton("Radio Button 2");
        JRadioButton rad3 = new JRadioButton("Radio Button 3");

        group.add(rad1);
        group.add(rad2);
        group.add(rad3);

        panel.add(rad1);
        panel.add(rad2);
        panel.add(rad3);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
