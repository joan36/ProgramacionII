/*
 * Programa que defineix un tauler d'escacs
 *
 */
package _escacs;

import javax.swing.*;

public class Escacs extends JFrame {

    Tauler tauler;

    public Escacs() {
        super("Escacs");
        tauler = new Tauler();
        this.getContentPane().add(tauler);
        this.setSize(tauler.getPreferredSize());
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Escacs esc = new Escacs();
        esc.setVisible(true);
    }

}

