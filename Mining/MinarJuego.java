package Mining;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Mining.Dialogue;



public class MinarJuego extends JFrame implements KeyListener {
    private int contador1 = 0;
    private int contador2 = 0;
    private JLabel contadorLabel1, contadorLabel2, dialogueLabel;
    private Timer timer;
    private int tiempoRestante = 10;
    private Dialogue dialogue = new Dialogue();

    public MinarJuego() {
        setTitle("Juego de Minar");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        contadorLabel1 = new JLabel("Contador 1: " + contador1);
        contadorLabel2 = new JLabel("Contador 2: " + contador2);
        dialogueLabel = new JLabel("PRUEBA" + dialogue.dialogos[0]);

        JPanel panelContadores = new JPanel();
        panelContadores.setLayout(new GridLayout(1, 2));
        panelContadores.add(contadorLabel1);
        panelContadores.add(contadorLabel2);
        panelContadores.add(dialogueLabel);

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

    public class BotonEjemplo extends JFrame {
        public BotonEjemplo() {
            setTitle("Ejemplo de Botón");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 200);
    
            // Creamos un nuevo botón
            JButton boton = new JButton("Haz clic aquí");
    
            // Agregamos un ActionListener al botón para manejar eventos de clic
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Acciones a realizar cuando se hace clic en el botón
                    JOptionPane.showMessageDialog(null, "¡Has hecho clic en el botón!");
                }
            });

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
        }else if (keyCode == KeyEvent.VK_SPACE) {
            setTitle("SEX!");
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