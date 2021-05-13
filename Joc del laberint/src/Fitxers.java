import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fitxers {
    static void lecturaLaberint(){
        int files;
        int columnes;
        final int longExacta = 4;
        final int fin = 19;
        int[][] matriu=new int[19][4];
        int i =0;

        try {
            File arxiu = new File("Laberints/maze1.txt");
            RandomAccessFile f=new RandomAccessFile(arxiu,"r");
            long numreg = f.length() / longExacta;

            files= Integer.parseInt(f.readLine());
            columnes= Integer.parseInt(f.readLine());
            while (f.readChar()!=0 && f.readChar()!=1){
                for (int j = 0; j < longExacta; j++) {
                    matriu[i][j]=f.readChar();
                }
                i++;
            }

            



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
