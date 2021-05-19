import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fitxers {
    static char[][] lecturaLaberint() {
        int files, columnes, filaSortida, columnesSortida;
        final int longExacta = 4;
        final int fin = 15;
        char[][] matriu = new char[150][4];
        String numero = "";
        int i = 0;

        try {
            File arxiu = new File("Laberints/maze1.txt");
            RandomAccessFile f = new RandomAccessFile(arxiu, "r");

            files = Integer.parseInt(f.readLine());
            columnes = Integer.parseInt(f.readLine());

            for (int j = 0; j < fin; j++) {
                numero += f.readLine();

            }
            char[] n = numero.toCharArray();

            while (i != n.length) {
                for (int j = 0; j < 150; j++) {
                    for (int k = 0; k < 4; k++) {
                        matriu[j][k] = n[i];
                        i++;
                    }
                }
            }

            filaSortida = Integer.parseInt(f.readLine());
            columnesSortida = Integer.parseInt(f.readLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matriu;
    }
}
