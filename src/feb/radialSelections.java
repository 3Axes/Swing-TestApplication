package feb;
//2.26.20

import javax.swing.*;
import java.awt.*;

public class radialSelections {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radial Selections");
        frame.setDefaultCloseOperation(3);
        JPanel panel = new JPanel();

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

        //ButtonGroup checkGroup = new ButtonGroup();

        JCheckBox check1 = new JCheckBox("Checkbox 1");
        JCheckBox check2 = new JCheckBox("Checkbox 2");
        JCheckBox check3 = new JCheckBox("Checkbox 3");

        //checkGroup.add(check1);
        //checkGroup.add(check2);
        //checkGroup.add(check3);

        panel.add(check1);
        panel.add(check2);
        panel.add(check3);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
