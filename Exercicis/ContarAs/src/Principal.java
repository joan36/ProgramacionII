import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    final static int FINAL_FICHERO = -1;

    public static void main(String[] args)  {
            try {
                int contador = 0;
                int letra;

                FileReader fichero;

                fichero = new FileReader("texto.txt");
                letra = fichero.read();

                while (letra != FINAL_FICHERO) {
                    if (((char) letra) == 'a') {
                        contador++;
                    }
                }
                letra=fichero.read();
                fichero.close();
                System.out.println("EL numero de As del fichero es: " + contador);

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
