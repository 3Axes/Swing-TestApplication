package feb20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class icons {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("assets\\icon1.png");

        JFrame frame = new JFrame("porn tab hider.exe");
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(3);

//        JPanel panel = new JPanel();
////        panel.setLayout(new GridLayout(0,1));

        ImageIcon clown = new ImageIcon("assets\\clown.jpg");

        JRadioButton button = new JRadioButton("What a clown", clown);

        button.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("bruh button\nbruh button\n\n");
            }
        });

//        panel.add(button);

        JLabel label = new JLabel("test(es)");

        frame.add(button);
        frame.add(label);

        frame.pack();
        frame.setVisible(true);
        frame.setSize(new Dimension(new Dimension(69420, 3)));
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
    }
}
