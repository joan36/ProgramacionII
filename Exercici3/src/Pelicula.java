import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {

    private  String titol;
    private  String nomDirector;
    private  int anyEstrena;
    private  Genere genere;
    //Centinela
    public static final Pelicula centinela = new Pelicula("zzz","zzz",999, Genere.ACCIO);


    //Constructors
    public Pelicula() {
    }

    public Pelicula(String titol, String nomDirector, int anyEstrena, Genere genere) {
        this.titol = titol;
        this.nomDirector = nomDirector;
        this.anyEstrena = anyEstrena;
        this.genere = genere;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getNomDirector() {
        return nomDirector;
    }

    public void setNomDirector(String nomDirector) {
        this.nomDirector = nomDirector;
    }

    public int getAnyEstrena() {
        return anyEstrena;
    }

    public void setAnyEstrena(int anyEstrena) {
        this.anyEstrena = anyEstrena;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Pelicula getCentinela() {
        return centinela;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return anyEstrena == pelicula.anyEstrena && Objects.equals(titol, pelicula.titol) && Objects.equals(nomDirector, pelicula.nomDirector) && genere == pelicula.genere && Objects.equals(centinela, pelicula.centinela);
    }

    public boolean isSentinel(){
        return titol.equals(centinela.titol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titol, nomDirector, anyEstrena, genere, centinela);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titol='" + titol + '\'' +
                ", nomDirector='" + nomDirector + '\'' +
                ", anyEstrena=" + anyEstrena +
                ", genere=" + genere +
                '}';
    }
}


