import java.io.Serializable;

public class Pelicula implements Serializable {

    private static String titol;
    private static String nomDirector;
    private static int anyEstrena;
    private static Genere genere;
    public static final Pelicula centinela = new Pelicula("zzz","zzz",999, Genere.ACCIO);


    //Constructors
    public Pelicula() {
    }
    public Pelicula(String titol,String nomDirector,int anyEstrena,Genere genere){
        titol=titol;
        nomDirector=nomDirector;
        anyEstrena=anyEstrena;
        genere=genere;
    }



    public static String getTitol() {
        return titol;
    }

    public static void setTitol(String titol) {
        Pelicula.titol = titol;
    }

    public static String getNomDirector() {
        return nomDirector;
    }

    public static void setNomDirector(String nomDirector) {
        Pelicula.nomDirector = nomDirector;
    }

    public static int getAnyEstrena() {
        return anyEstrena;
    }

    public static void setAnyEstrena(int anyEstrena) {
        Pelicula.anyEstrena = anyEstrena;
    }

    public static Genere getGenere() {
        return genere;
    }

    public static void setGenere(Genere genere) {
        Pelicula.genere = genere;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Pelicula{}";
    }
}


