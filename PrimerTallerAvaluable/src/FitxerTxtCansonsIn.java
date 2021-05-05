import java.io.*;

public class FitxerTxtCansonsIn {

    public static void lleguirCanso(String nomFicher) {

        try {
            String s;

            //LLeguim el ficher.txt
            FileInputStream entrada = new FileInputStream(nomFicher+".txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(entrada));

            //Escribir el nou ficher.dat
            FileOutputStream sortida =new FileOutputStream(nomFicher+".dat");
            ObjectOutputStream fs=new ObjectOutputStream(sortida);


            s = in.readLine();
            //Bucle fins recorre tot el ficher pasat per parametres.
            while (s != null) {

                //Cream Objecte Canso
                Canso a = new Canso();
                a.setTitol(s);
                a.setGrup(in.readLine());
                a.setAlbum(in.readLine());
                a.setGenere(in.readLine());
                a.setAnyEdicio(Integer.parseInt(in.readLine()));
                a.setData(in.readLine());

                fs.writeObject(a);


                s = in.readLine();
            }
            fs.writeObject(Canso.CENTINELA);
            //Tancament fichers.
            entrada.close();
            fs.close();

            //Tractament de errors
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

