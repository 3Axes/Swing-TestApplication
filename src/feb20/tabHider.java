package feb20;

import javax.swing.*;
import java.awt.*;

public class tabHider {
    public static void main(String[] args) {
        String title = null;

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.equalsIgnoreCase("-title")) {
                try {
                    title = args[i + 1];
                    break;
                }
                catch(Exception e) {
                    System.out.println("No arguments given for '-title'");
                }
            }
        }

        if (title == null) {
            title = "Google Chrome";
        }

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;

        runWindow(title, screenWidth);

    }

    private static void runWindow(String title, int width) {
        JFrame frame = new JFrame(title);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        frame.setVisible(true);
        frame.pack();
        frame.setSize(width, 0);
    }
}
