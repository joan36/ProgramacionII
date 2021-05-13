import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Laberint extends JFrame implements ActionListener {
    private JTextField l;


    public Laberint(){
        setTitle("Joc del laberint");
        setSize(800,900);
        setLocationRelativeTo(null);//El laberint surt al centre
        setDefaultCloseOperation(Laberint.EXIT_ON_CLOSE);
        initContents();
    }

    private void initContents(){

    }

    public static void main(String[] args) {
        //new Laberint().setVisible(true);
        Fitxers.lecturaLaberint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
