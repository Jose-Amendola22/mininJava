package Mining;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyKeyListener implements KeyListener {
    private MinarJuego minarJuego;
    private JLabel labelToUpdate;
    private Dialogue dialogue;

    public MyKeyListener(MinarJuego minarJuego, JLabel labelToUpdate, Dialogue dialogue) {
        this.minarJuego = minarJuego;
        this.labelToUpdate = labelToUpdate;
        this.dialogue = dialogue;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Check for a specific key press, e.g., KeyEvent.VK_SPACE
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            // Get dialogue from Dialogue class and update label
            if (!dialogue.isFinished)
            {
                labelToUpdate.setText("Más despacio vaquero");
            }
            else
            {
                labelToUpdate.setText("SHOOTED");
            }
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }
}
