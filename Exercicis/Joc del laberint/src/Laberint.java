import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Laberint extends JFrame implements ActionListener {
    private JTextField l;
    private static final int files =15;
    private static final int columna =10;


    public Laberint(){
        setTitle("Joc del laberint");
        setSize(800,900);
        setLocationRelativeTo(null);//El laberint surt al centre
        setDefaultCloseOperation(Laberint.EXIT_ON_CLOSE);
        pintaLaberint();

    }

    private void pintaLaberint(){
        char[][] laberinto = Fitxers.lecturaLaberint();
        int y=0;

        for (int i = 0; i < files; i++) {
            int x=0;
            for (int j = 0; j < columna; j++) {
                Rectangle2D.Float r = new Rectangle2D.Float(x,y,40,40);

            }
        }

    }

    public static void main(String[] args) {
        new Laberint().setVisible(true);
        //Fitxers.lecturaLaberint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
