/*
 * Ordenació de tauls amb el mètode de la bombolla. Aquest mètode fa tantes
 * passades com elements hi ha a la taula menys 1, a cada passada es garenteix
 * que l'element i-èssim quedarà al seu lloc (el darrer hi quedarà tot sol); a
 * més a cada passada els elements de menor pes van pujant als llocs "superiors"
 * de la taula. Pensau en la taula dibuixada verticalment: els llocs superiors
 * són els índex més baixos i els inferiors són cap al final de la taula, els
 * elements de menor pes són els de valor menor segons el camp clau.
 */
package _ordenaciotaules3;

/**
 *
 * @author miquelmascarooliver
 */
import java.util.Random;

public class OrdenacioTaules3 {

    public static void emplenarAleatoriament(Dades[] t, int vsup) {
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            t[i] = new Dades(rnd.nextInt(vsup));
        }
    }

    public static String escriureTaula(Dades[] t) {
        String resultat = "";
        for (int i = 0; i < t.length; i++) {
            resultat += t[i].clau + " ";
        }
        return resultat;
    }

    private static void bombolla(Dades[] t) {
        final int N = t.length;
        Dades x;
        for (int i = 0; i < N - 1; i++) {
            for (int j = N - 2; j >= i; j--) {
                if (t[j + 1].clau < t[j].clau) {
                    x = t[j + 1];
                    t[j + 1] = t[j];
                    t[j] = x;
                }
            }
            System.out.println("Passada " + i + ": " + escriureTaula(t));
        }
    }

    public static void main(String[] args) {
        final int N = 10;
        Dades t[] = new Dades[N];
        emplenarAleatoriament(t, 100);
//        Dades t[] = {new Dades(87), new Dades(85), new Dades(12),
//            new Dades(11), new Dades(22), new Dades(79), new Dades(62),
//            new Dades(63), new Dades(19), new Dades(84)};
        System.out.println("Exemple d'ordenació de taules amb el mètode"
                + " de la bombolla\n");
        System.out.println("Valors a ordenar: " + escriureTaula(t) + "\n");
        bombolla(t);
        System.out.println("\nTaula ordenada: " + escriureTaula(t));
    }
}
