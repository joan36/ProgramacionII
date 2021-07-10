import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File {
    public static void main(String[] args) {
        try {
            FileOutputStream exit = new FileOutputStream("peliculas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(exit);


            for (int i = 0; i < 1; i++) {

               Pelicula p=new Pelicula(titol(),director(),any(),genere());
               oos.writeObject(p);
            }
            oos.writeObject(Pelicula.centinela);
            oos.close();

            //Leer origen.
            FileInputStream in = new FileInputStream("peliculas.dat");
            ObjectInputStream ois=new ObjectInputStream(in);

            //Generar objetoS ObjectOutputStream
            for (Genere genere: Genere.values()){
                FileOutputStream genere = new FileOutputStream(genere + ".dat");
                ObjectOutputStream genere + "out" = new ObjectOutputStream(genere);
            }

            Pelicula p=(Pelicula) ois.readObject();
            while (!p.isSentinel()){

                //Escribir objeto en el fichero.
                genere+"out".writeObject(p);

                p=(Pelicula) ois.readObject();
            }
            //Escribir Centinela
            for (Genere genere: Genere.values()){
                genere+"out".writeObject(Pelicula.centinela);
            }

            //Cerrar ficheros
            for (Genere genere: Genere.values()){
                genere+"out".close();
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static String titol(){
        System.out.println("Nom pelicula");
        return (LT.readLine());
    }

    public static String director(){
        System.out.println("Director Pelicula");
        return (LT.readLine());
    }

    public static Genere genere(){
        System.out.println("Genere");
        System.out.println(java.util.Arrays.asList(Genere.values()));
        return (Genere.valueOf(LT.readLine().toUpperCase()));
    }

    public static int any(){
        System.out.println("Any Estrena");
        return (LT.readInt());
    }

}
