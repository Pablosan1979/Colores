
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem m1, m2, m3, m4, m5, m6;
    private JButton boton1;

    public Formulario() {
        setLayout(null);
        boton1 = new JButton("Cambiar tamaño");
        boton1.setBounds(10, 80, 200, 30);
        add(boton1);
        boton1.addActionListener((ActionEvent e) -> {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            setSize(screenSize.width / 2, screenSize.height / 2);
        });
        mb = new JMenuBar();
        setJMenuBar(mb);
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        m1 = new JMenuItem("Rojo");
        m1.addActionListener(this);
        menu1.add(m1);
        m2 = new JMenuItem("Verde");
        m2.addActionListener(this);
        menu1.add(m2);
        m3 = new JMenuItem("Azul");
        m3.addActionListener(this);
        menu1.add(m3);
        m4 = new JMenuItem("negro");
        m4.addActionListener(this);
        menu1.add(m4);
        m5 = new JMenuItem("Naranja");
        m5.addActionListener(this);
        menu1.add(m5);
        m6 = new JMenuItem("Amarillo");
        m6.addActionListener(this);
        menu1.add(m6);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        java.awt.Container f = this.getContentPane();
        if (e.getSource() == m1) {
            f.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == m2) {
            f.setBackground(new Color(0, 255, 0));
        }
        if (e.getSource() == m3) {
            f.setBackground(new Color(0, 0, 255));
        }
        if (e.getSource() == m4) {
            f.setBackground(new Color(0, 0, 0));
        }
        if (e.getSource() == m5) {
            f.setBackground(new Color(255, 140, 0));
        }
        if (e.getSource() == m6) {
            f.setBackground(new Color(255, 255, 0));
        }
    }

    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(10, 20, 500, 300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
