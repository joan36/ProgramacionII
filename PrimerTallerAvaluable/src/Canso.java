public class Canso {
    private String titol;
    private String grup;
    private String album;
    private String genere;
    private int anyEdicio;
    private String data;

    //Centinela
    public static final Canso CENTINELA = new Canso("zzz","zzz","zzz","zzz",999,"99/99/99");

    //Constructor
    public Canso() {
    }

    public Canso(String titol, String grup, String album, String genere, int anyEdicio, String data) {
        this.titol = titol;
        this.grup = grup;
        this.album = album;
        this.genere = genere;
        this.anyEdicio = anyEdicio;
        this.data = data;
    }


    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getAnyEdicio() {
        return anyEdicio;
    }

    public void setAnyEdicio(int anyEdicio) {
        this.anyEdicio = anyEdicio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    @Override
    public String toString() {
        return "Canso{" +
                "titol='" + titol + '\'' +
                ", grup='" + grup + '\'' +
                ", album='" + album + '\'' +
                ", genere='" + genere + '\'' +
                ", anyEdicio=" + anyEdicio +
                ", data=" + data +
                '}';
    }
}
