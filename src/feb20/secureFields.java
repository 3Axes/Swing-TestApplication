package feb20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class secureFields {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Secure Field");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        frame.setDefaultCloseOperation(3);

        JLabel label = new JLabel("Secure Field");
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        JButton enter = new JButton(new AbstractAction("Enter") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(String.format("Username: %s\nPassword: %s", username.getText(), new String(password.getPassword())));
                System.exit(0);
            }
        });

        panel.add(label);
        panel.add(username);
        panel.add(password);
        panel.add(enter);
        frame.add(panel);

        frame.setSize(600,600);
        panel.setSize(600, 600);
        frame.pack();
        frame.setVisible(true);
    }
}
