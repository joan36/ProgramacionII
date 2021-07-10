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

    }

    @Override
    public void paintComponents(Graphics g) {
        char[][] laberinto = Fitxers.lecturaLaberint();
        int y=0;
        final int FILES=15;
        final int COLUMNES=8;
        Graphics2D g2d = (Graphics2D) g;

        for (int i = 0; i < FILES; i++) {
            int x=0;
            for (int j = 0; j < COLUMNES; j++) {
                Rectangle2D.Float r = new Rectangle2D.Float(x,y,40,40);
                g2d.setColor(Color.black);

            }
        }
    }

    public static void main(String[] args) {
        Laberint lab = new Laberint();
        lab.setVisible(true);
        //Fitxers.lecturaLaberint();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
