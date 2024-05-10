package Mining;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Mining.Dialogue;



public class MinarJuego extends JFrame {
    private JLabel label1, label2, labelTimer;
    private Dialogue dialogo = new Dialogue();
    private MyTimer timer = new MyTimer();

    public MinarJuego() {
        // Set up the JFrame
        setTitle("Mining Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1)); // Two rows, one column

        // Create the labels
        label1 = new JLabel("Label 1");
        label2 = new JLabel("Label 2");
        labelTimer = new JLabel("Timer: " + timer.getElapsedTime());

        // Add labels to the panel
        panel.add(label1);
        panel.add(label2);
        panel.add(labelTimer);

        // Add mouse click listener to the panel
        MouseClickListener mouseClickListener = new MouseClickListener(this, label1, dialogo, timer);
        panel.addMouseListener(mouseClickListener);

        MyKeyListener keyListener = new MyKeyListener(this, label2, dialogo);
        addKeyListener(keyListener);
        setFocusable(true);

        add(panel);
        setVisible(true);

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MinarJuego();
            }
        });
    }
}