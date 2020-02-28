package feb20;

import javax.swing.*;

public class selectionList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Selecting List");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(3);

        String[] options = {"Option 1", "Option 2", "Option 3"};
        JList<String> list = new JList<String>(options);

        panel.add(list);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
