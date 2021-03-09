import java.io.*;

public class ObjectOutputStreamFile {
    public static void esciribrDatos(Pelicula pelicula) {
        try {
            FileOutputStream sortida = new FileOutputStream("peliculas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(sortida);


            oos.writeObject(pelicula);
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
