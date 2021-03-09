import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Principal {
    public static void main(String[] args) {
        try {
            //Variables
            Pelicula pelicula = new Pelicula();
            ObjectOutputStreamFile outputStream = new ObjectOutputStreamFile();
            ObjectInputStreamFile objectInputStream = new ObjectInputStreamFile();


            for (int i = 0; i < 1; i++) {
                System.out.println("-------------------Pelicula " + i + " ------------------------");
                recoirDades();

                ObjectOutputStreamFile.esciribrDatos(pelicula);

            }
            ObjectOutputStreamFile.esciribrDatos(Pelicula.centinela);
            //Limipiar pantalla
            clear();

            //Coger objetos
            ObjectInputStreamFile.leerDatos();


        } catch (Exception e) {

        }
    }

    public static void recoirDades() {

        System.out.println("Nom pelicula");
        Pelicula.setTitol(LT.readLine());

        System.out.println("Director Pelicula");
        Pelicula.setNomDirector(LT.readLine());

        System.out.println("Genere");
        System.out.println(java.util.Arrays.asList(Genere.values()));
        String genere = LT.readLine().toUpperCase();
        Pelicula.setGenere((Genere.valueOf(genere)));

        System.out.println("Any Estrena");
        Pelicula.setAnyEstrena(LT.readInt());


    }

    public static void clear() {
        System.out.println("\n\n\n\n\n\n\n");
    }
}
