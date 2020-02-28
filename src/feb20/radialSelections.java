package feb20;
//2.26.20

import javax.swing.*;

public class radialSelections {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        JFrame frame = new JFrame("Radial Selections");
        frame.setDefaultCloseOperation(3); // EXIT_ON_CLOSE - MagicConstant is 3
        JPanel panel = new JPanel();

        // Dumb look and feel code lol
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

        ButtonGroup group = new ButtonGroup(); // Makes it so that only one radio button from this group can be selected at once.

        JRadioButton rad1 = new JRadioButton("Radio Button 1");
        JRadioButton rad2 = new JRadioButton("Radio Button 2");
        JRadioButton rad3 = new JRadioButton("Radio Button 3");

        // Adding buttons to group
        group.add(rad1);
        group.add(rad2);
        group.add(rad3);

        // Can't add a ButtonGroup to a panel object, have to add all buttons individually
        panel.add(rad1);
        panel.add(rad2);
        panel.add(rad3);

        // This isn't used because more than one checkbox can be selected at the same time.
        //ButtonGroup checkGroup = new ButtonGroup();

        JCheckBox check1 = new JCheckBox("Checkbox 1");
        JCheckBox check2 = new JCheckBox("Checkbox 2");
        JCheckBox check3 = new JCheckBox("Checkbox 3");

        // Again, not used
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
