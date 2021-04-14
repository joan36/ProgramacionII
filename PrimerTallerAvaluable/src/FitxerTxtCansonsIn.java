import java.io.*;

public class FitxerTxtCansonsIn {
    public static void lleguirCansons(){

while (lleguir()!=null){
    System.out.println(lleguir());
}


    }

    public static Canso lleguir(){

        Canso a=new Canso();
        try {
            FileInputStream americana = new FileInputStream("Americana.txt");
            BufferedReader in=new BufferedReader(new InputStreamReader(americana));

            String amer;

            amer = in.readLine();
            a.setTitol(amer);
            a.setGrup(in.readLine());
            a.setAlbum(in.readLine());
            a.setGenere(in.readLine());
            a.setAnyEdicio(Integer.parseInt(in.readLine()));
            a.setData(in.readLine());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return a;

    }
}

