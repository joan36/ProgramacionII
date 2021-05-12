package pkg137_operacionsmatrius4;

import java.util.Random;

/**
 *
 * @author miquelmascaro
 */
public class Matriu {

    /**
     * Classe Matriu per definir matrius de qualsevol dimensió i operacions
     * entre elles Es defineixen els següents atributs: m és la matriu
     * pròpiament dita, on s'emmagatzemen els valors (double en aquest cas); dos
     * enters files i columnes que permetran tractar aquests valors de la
     * matriu.
     *
     * @param dimensio del vector
     */
    private double m[][];
    private int files, columnes;

    /**
     * Es defineix l'excepció de RangsInconsistents per controlar les operacions
     * que no es poden dur a terme.
     */
    public static class RangsInconsistents extends Exception {

        public RangsInconsistents(String s) {
            super(s);
        }
    }

    /**
     * El constructor també controla que els rangs siguin positius, això és
     * redundant ja que automàticament botaria una excepció predefinida. El
     * constructor defineix la taula bidimensional i els enters de files i
     * columnes.
     *
     * @param dim1
     * @param dim2
     */
    public Matriu(int dim1, int dim2) {
        try {
            if (dim1 <= 0 || dim2 <= 0) {
                throw new RangsInconsistents("Rangs incosistents");
            }
            this.m = new double[dim1][dim2];
            this.files = dim1;
            this.columnes = dim2;
        } catch (RangsInconsistents e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Retorna el nombre de files de la matrius
     *
     * @return
     */
    public int getFiles() {
        return this.files;
    }

    /**
     * Retorna el nombre de columnes de la matriu
     *
     * @return
     */
    public int getColumnes() {
        return this.columnes;
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                s += m[i][j] + " ";
            }
            s += "\n ";
        }
        return s;
    }

    /**
     * Assigna el valor a la posició (i,j)
     *
     * @param i
     * @param j
     * @param x
     */
    public void setValor(int i, int j, double x) {
        this.m[i][j] = x;
    }

    /**
     * Emplena la matriu amb valors enters entre 0 i
     *
     * @param vsup
     */
    public void ompleAleatori(int vsup) {
        Random rnd = new Random();
        for (int i = 0; i < this.files; i++) {
            for (int j = 0; j < this.columnes; j++) {
                this.m[i][j] = rnd.nextInt(vsup);
            }
        }
    }

    /**
     * El mètode assigna escriu els valors d'un objecte matriu dins un altre
     * igual en files i columnes, en cas contrari genera la corresponent
     * excepció. Si s'usa l'operador = si no hi ha coincidència de files i
     * columnes no es produeix cap error i la darrera matriu pren les dimensions
     * de la matriu assignada. La còpia d'una matriu a una altra es pot fer de
     * forma manual com a l'exemple o emprant System.arraycopy(orig.m[i], 0,
     * this.m[i], 0, columnes); com és suggereix al warning.
     *
     * @param orig
     */
    public void assigna(Matriu orig) throws RangsInconsistents {
        if (this.files != orig.files || this.columnes != orig.columnes) {
            throw new RangsInconsistents("Rangs incosistents");
        }
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                this.m[i][j] = orig.m[i][j];
            }
        }
    }

    /**
     * El mètode sumar fa la suma de dues matrius la versió estàtica. Es
     * controla la coherència de files i columnes i fa un recorregut sumant
     * component a component.
     *
     * @param a
     * @param b
     * @return
     * @throws RangsInconsistents
     */
    public static Matriu sumar(Matriu a, Matriu b) throws RangsInconsistents {
        if ((a.files != b.files) || (a.columnes != b.columnes)) {
            throw new RangsInconsistents("Rangs inconsistents");
        }
        Matriu desti = new Matriu(a.files, b.files);
        for (int i = 0; i < desti.files; i++) {
            for (int j = 0; j < desti.columnes; j++) {
                desti.m[i][j] = a.m[i][j] + b.m[i][j];
            }
        }
        return desti;
    }

    /**
     * El mètode sumar fa la suma de dues matrius la versió basada en objectes.
     * Es controla la coherència de files i columnes i fa un recorregut sumant
     * component a component.
     *
     * @param a
     * @return
     * @throws RangsInconsistents
     */
    public Matriu sumar(Matriu a) throws RangsInconsistents {
        if ((this.files != a.files) || (this.columnes != a.columnes)) {
            throw new RangsInconsistents("Rangs inconsistents");
        }
        Matriu resultat = new Matriu(this.files, this.columnes);
        for (int i = 0; i < this.files; i++) {
            for (int j = 0; j < this.columnes; j++) {
                resultat.m[i][j] = this.m[i][j] + a.m[i][j];
            }
        }
        return resultat;
    }

    /**
     * El mètode producte fa la multiplicació de dues matrius la versió
     * estàtica. Es controla la coherència de files i columnes i fa un
     * recorregut de files i dins aquest un de columnes de la matriu resultant o
     * el que és el mateix: si es multiplica A * B les files de A per les
     * columnes de B. Dins aquest recorregut s'ha de fer la suma de productes
     * per això es fa un recorregut intern per les columnes de A (que és el
     * mateix que les files de B).
     *
     * @param a
     * @param b
     * @return
     * @throws RangsInconsistents
     */
    public static Matriu producte(Matriu a, Matriu b)
            throws RangsInconsistents {
        if (a.columnes != b.files) {
            throw new RangsInconsistents("Rangs inconsistents");
        }
        Matriu resultat = new Matriu(a.files, b.columnes);
        for (int i = 0; i < a.files; i++) {
            for (int j = 0; j < b.columnes; j++) {
                resultat.m[i][j] = 0;
                for (int k = 0; k < a.columnes; k++) {
                    resultat.m[i][j] += a.m[i][k] * b.m[k][j];
                }
            }
        }
        return resultat;
    }

    /**
     * El mètode producte fa la multiplicació de dues matrius la versió basada
     * en objectes. Es controla la coherència de files i columnes i fa un
     * recorregut de files i dins aquest un de columnes de la matriu resultant o
     * el que és el mateix: si es multiplica A * B les files de A per les
     * columnes de B. Dins aquest recorregut s'ha de fer la suma de productes
     * per això es fa un recorregut intern per les columnes de A (que és el
     * mateix que les files de B).
     *
     * @param a
     * @return
     * @throws RangsInconsistents
     */
    public Matriu producte(Matriu a) throws RangsInconsistents {
        if (this.columnes != a.files) {
            throw new RangsInconsistents("Rangs inconsistents");
        }
        Matriu resultat = new Matriu(this.files, a.columnes);
        for (int i = 0; i < this.files; i++) {
            for (int j = 0; j < a.columnes; j++) {
                resultat.m[i][j] = 0;
                for (int k = 0; k < this.columnes; k++) {
                    resultat.m[i][j] += this.m[i][k] * a.m[k][j];
                }
            }
        }
        return resultat;
    }
}
