import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File {
    public static void fichero() {
        try {
            FileOutputStream exit = new FileOutputStream("peliculas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(exit);
            Principal principal=new Principal();

            for (int i = 0; i < 1; i++) {
               Pelicula p=new Pelicula();
               oos.writeObject(p);
            }
            oos.writeObject(Pelicula.centinela);
            oos.close();


            FileInputStream in = new FileInputStream("peliculas.dat");
            ObjectInputStream ois=new ObjectInputStream(in);

            Pelicula p=(Pelicula) ois.readObject();
            while (!p.isSentinel()){
                System.out.println(p);
                p=(Pelicula) ois.readObject();
            }
            ois.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }


}
