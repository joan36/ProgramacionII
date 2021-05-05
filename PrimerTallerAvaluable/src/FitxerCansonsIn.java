import java.io.*;

public class FitxerCansonsIn {
    public static void lleguirObjectesCanso() {

        try {
            FileInputStream americanIn = new FileInputStream("Americana.dat");
            ObjectInputStream a = new ObjectInputStream(americanIn);

            FileInputStream darrerIn = new FileInputStream("Darrers.dat");
            ObjectInputStream d = new ObjectInputStream(darrerIn);

            FileInputStream nacionalIn = new FileInputStream("Nacional.dat");
            ObjectInputStream n = new ObjectInputStream(nacionalIn);

            FileOutputStream sortida =new FileOutputStream("Musica.dat");
            ObjectOutputStream s = new ObjectOutputStream(sortida);

            Canso c1, c2, c3;

            c1 = (Canso) a.readObject();
            c2 = (Canso) d.readObject();
            c3 = (Canso) n.readObject();

            while (c1 != Canso.CENTINELA && c2 != Canso.CENTINELA && c3 != Canso.CENTINELA) {

                if (Data.compararData(Data.objecteData(c1.getData()), Data.objecteData(c2.getData()))) {
                    if (Data.compararData(Data.objecteData(c1.getData()), Data.objecteData(c3.getData()))) {
                        s.writeObject(c1);
                        c1 = (Canso) a.readObject();
                    }
                } else if (Data.compararData(Data.objecteData(c2.getData()), Data.objecteData(c3.getData()))) {

                    s.writeObject(c2);
                    c2 = (Canso) a.readObject();

                } else {
                    s.writeObject(c3);
                    c3 = (Canso) a.readObject();
                }
            }

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
