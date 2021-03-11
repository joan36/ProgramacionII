import java.io.*;

public class ObjectInputStreamFile {
    public static void leerDatos() {
        try {
            FileInputStream in = new FileInputStream("peliculas.dat");
            ObjectInputStream ois = new ObjectInputStream(in);

            Pelicula p = (Pelicula) ois.readObject();
            while (!p.isSentinel()) {

                System.out.println(p);
                p = (Pelicula) ois.readObject();
            }
            in.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
