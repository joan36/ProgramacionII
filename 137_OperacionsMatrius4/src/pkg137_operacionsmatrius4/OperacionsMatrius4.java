/*
 * Operacions amb matrius
 */
package pkg137_operacionsmatrius4;

/**
 *
 * @author miquelmascarooliver
 */
public class OperacionsMatrius4 {

    public static void main(String[] args) {
        Matriu a = new Matriu(3, 2);
        Matriu b = new Matriu(2, 3);
        Matriu c = new Matriu(3, 3);
        a.ompleAleatori(100);
        System.out.println("Matriu a, les dades són: \n" + a);
        b.ompleAleatori(100);
        System.out.println("Matriu b, les dades són: \n" + b);
        try {
            c = Matriu.producte(a, b);
            System.out.println("El resultat a per b és c: \n" + c);
        } catch (Matriu.RangsInconsistents e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            c = a.producte(b);
            System.out.println("El resultat a per b és c: \n" + c);
        } catch (Matriu.RangsInconsistents e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            b = a.producte(c);
            System.out.println("El resultat a per c és: \n" + b);
        } catch (Matriu.RangsInconsistents e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
