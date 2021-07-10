import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File {
    public static void main(String[] args) {
        try {
            //Escribir fichero
            FileOutputStream exit = new FileOutputStream("peliculas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(exit);

            for (int i = 0; i < 1; i++) {

                Pelicula p=new Pelicula(titol(),director(),any(),genere());
                oos.writeObject(p);
            }
            oos.writeObject(Pelicula.centinela);
            oos.close();

            //Leer fixero
            FileInputStream in = new FileInputStream("peliculas.dat");
            ObjectInputStream ois=new ObjectInputStream(in);

            Pelicula p=(Pelicula) ois.readObject();

            while (!p.isSentinel()){

                switch (p.getGenere()){
                    case ACCIO:
                        FileOutputStream accio = new FileOutputStream("ACCIO.dat");
                        ObjectOutputStream acout = new ObjectOutputStream(accio);
                        acout.writeObject(p);
                        break;
                    case AUTOR:
                        FileOutputStream autor = new FileOutputStream("AUTOR.dat");
                        ObjectOutputStream aout = new ObjectOutputStream(autor);
                        aout.writeObject(p);
                        break;
                    case COMEDIA:
                        FileOutputStream comedia = new FileOutputStream("COMEDIA.dat");
                        ObjectOutputStream cout = new ObjectOutputStream(comedia);
                        cout.writeObject(p);
                        break;
                    case POLICIACA:
                        FileOutputStream policiaca = new FileOutputStream("POLICIACA.dat");
                        ObjectOutputStream pout = new ObjectOutputStream(policiaca);
                        pout.writeObject(p);
                        break;
                    case DRAMA:
                        FileOutputStream drama = new FileOutputStream("DRAMA.dat");
                        ObjectOutputStream dout = new ObjectOutputStream(drama);
                        dout.writeObject(p);
                        break;
                }
                p=(Pelicula) ois.readObject();
            }
            ois.close();

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
