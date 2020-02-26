package feb;
//2.20.20

import javax.swing.*;

public class test1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Text");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
}
