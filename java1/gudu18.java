import java.awt.*;
import java.awt.event.*;

public class gudu18 {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Button Example");

        // Create a button
        Button button = new Button("Click Me");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Welcome");
            }
        });

        // Add the button to the frame
        frame.add(button, BorderLayout.CENTER);

        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
