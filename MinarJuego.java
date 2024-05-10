
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MinarJuego extends JFrame implements KeyListener {
    private int contador1 = 0;
    private int contador2 = 0;
    private JLabel contadorLabel1, contadorLabel2;
    private Timer timer;
    private int tiempoRestante = 10;

    public MinarJuego() {
        setTitle("Juego de Minar");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        contadorLabel1 = new JLabel("Contador 1: " + contador1);
        contadorLabel2 = new JLabel("Contador 2: " + contador2);

        JPanel panelContadores = new JPanel();
        panelContadores.setLayout(new GridLayout(1, 2));
        panelContadores.add(contadorLabel1);
        panelContadores.add(contadorLabel2);

        add(panelContadores);

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tiempoRestante--;
                if (tiempoRestante >= 0) {
                    setTitle("Tiempo restante: " + tiempoRestante + " segundos");
                } else {
                    timer.stop();
                    setTitle("¡Tiempo agotado!");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setFocusable(true);
        panel.requestFocus();
        panel.addKeyListener(this);
        add(panel);

        timer.start();
    }

    public void keyTyped(KeyEvent e) {
    }


    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_A) {
            contador1++;
            contadorLabel1.setText("Contador 1: " + contador1);
        } else if (keyCode == KeyEvent.VK_B) {
            contador2++;
            contadorLabel2.setText("Contador 2: " + contador2);
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MinarJuego().setVisible(true);
            }
        });
    }
}