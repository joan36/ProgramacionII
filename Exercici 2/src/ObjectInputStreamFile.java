import java.io.*;

public class ObjectInputStreamFile {
    public static void leerDatos(){
        try {

            FileInputStream entrada=new FileInputStream("peliculas.dat");
            ObjectInputStream ois=new ObjectInputStream(entrada);

            Pelicula p=(Pelicula)ois.readObject();

            while (!p.equals(Pelicula.centinela)){
                System.out.println(p);
                p=(Pelicula)ois.readObject();
            }
            entrada.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
