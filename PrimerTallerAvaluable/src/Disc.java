import java.util.Objects;

public class Disc {
    private String titolAlbum;
    private String artista;
    private int anyEdicio;

    public Disc(String titolAlbum, String artista, int anyEdicio) {
        this.titolAlbum = titolAlbum;
        this.artista = artista;
        this.anyEdicio = anyEdicio;
    }

    public Disc() {

    }

    public String getTitolAlbum() {
        return titolAlbum;
    }

    public void setTitolAlbum(String titolAlbum) {
        this.titolAlbum = titolAlbum;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnyEdicio() {
        return anyEdicio;
    }

    public void setAnyEdicio(int anyEdicio) {
        this.anyEdicio = anyEdicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disc disc = (Disc) o;
        return anyEdicio == disc.anyEdicio && Objects.equals(titolAlbum, disc.titolAlbum) && Objects.equals(artista, disc.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolAlbum, artista, anyEdicio);
    }

    @Override
    public String toString() {
        return "Disc{" +
                "titolAlbum='" + titolAlbum + '\'' +
                ", artista='" + artista + '\'' +
                ", anyEdicio=" + anyEdicio +
                '}';
    }
}
