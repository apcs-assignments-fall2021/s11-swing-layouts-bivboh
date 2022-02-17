import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    public Calculator() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS)); // constructor for box panel

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        JButton seven = new JButton("7");
        panel.add(seven);
        JButton eight = new JButton("8");
        panel.add(eight);
        JButton nine = new JButton("9");
        panel.add(nine);
        JButton divide = new JButton("/");
        panel.add(divide);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        JButton four = new JButton("4");
        panel2.add(four);
        JButton five = new JButton("5");
        panel2.add(five);
        JButton six = new JButton("6");
        panel2.add(six);
        JButton multiply = new JButton("x");
        panel2.add(multiply);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        JButton one = new JButton("1");
        panel3.add(one);
        JButton two = new JButton("2");
        panel3.add(two);
        JButton three = new JButton("3");
        panel3.add(three);
        JButton subtract = new JButton("-");
        panel3.add(subtract);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
        JButton zero = new JButton("0");
        panel4.add(zero);
        JButton decimal = new JButton(".");
        panel4.add(decimal);
        JButton equal = new JButton("=");
        panel4.add(equal);
        JButton add = new JButton("+");
        panel4.add(add);

        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
