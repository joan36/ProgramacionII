import java.io.*;

public class ObjectOutputStreamFile {

    public static void esciribrDatos(Pelicula pelicula) {
        try {
            FileOutputStream sortida = new FileOutputStream("peliculas.dat",true);
            ObjectOutputStream oos = new ObjectOutputStream(sortida);

            oos.writeObject(pelicula);
            System.out.println("Objeto " + pelicula.toString() + " is save");
            oos.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
