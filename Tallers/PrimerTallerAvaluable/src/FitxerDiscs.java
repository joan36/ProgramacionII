import java.io.*;

public class FitxerDiscs {

    public static void escriureDisc() {

        try {
            FileInputStream americanIn = new FileInputStream("Americana.dat");
            ObjectInputStream a = new ObjectInputStream(americanIn);

            FileInputStream darrerIn = new FileInputStream("Darrers.dat");
            ObjectInputStream d = new ObjectInputStream(darrerIn);

            FileInputStream nacionalIn = new FileInputStream("Nacional.dat");
            ObjectInputStream n = new ObjectInputStream(nacionalIn);

            FileOutputStream sortida = new FileOutputStream("Discs.dat");
            ObjectOutputStream s = new ObjectOutputStream(sortida);

            Canso c1, c2, c3;

            c1 = (Canso) a.readObject();
            c2 = (Canso) d.readObject();
            c3 = (Canso) n.readObject();

            while (c1 != Canso.CENTINELA && c2 != Canso.CENTINELA && c3 != Canso.CENTINELA) {
                Disc d1 = new Disc(c1.getAlbum(), c1.getGrup(), c1.getAnyEdicio());
                while (c2 != Canso.CENTINELA) {
                    Disc d2 = new Disc(c2.getAlbum(), c1.getGrup(), c1.getAnyEdicio());
                }
                c1 = (Canso) a.readObject();
            }

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void lleguir() {
        try {
            FileInputStream disc = new FileInputStream("Discs.dat");
            ObjectInputStream d = new ObjectInputStream(disc);

            Disc f = (Disc) d.readObject();
            while (f!=null){
                System.out.println(f.toString());
                f = (Disc) d.readObject();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
