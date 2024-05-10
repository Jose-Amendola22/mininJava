package Mining;
import java.awt.event.*;

import javax.swing.JLabel;

public class MouseClickListener implements MouseListener {
    private MinarJuego minarJuego;
    private Dialogue dialogo;
    private JLabel labelToUpdate;
    private MyTimer timer;

    public MouseClickListener(MinarJuego minarJuego, JLabel labelToUpdate, Dialogue dialogue, MyTimer timer) {
        this.minarJuego = minarJuego;
        this.labelToUpdate = labelToUpdate;
        this.dialogo = dialogue;
        this.timer = timer;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Increment click count and set it in MinarJuego
        labelToUpdate.setText(dialogo.passDialogue());
        if (dialogo.isFinished)
        {
            timer.start();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Not used in this example
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Not used in this example
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Not used in this example
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Not used in this example
    }
}
