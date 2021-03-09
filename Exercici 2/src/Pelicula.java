public class Pelicula {

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
}


