import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Principal {
    public static void main(String[] args) {
        FitxerTxtCansonsIn.lleguirCanso("Americana");
        FitxerTxtCansonsIn.lleguirCanso("Darrers");
        FitxerTxtCansonsIn.lleguirCanso("Nacional");
        FitxerCansonsIn.lleguirObjectesCanso();

        FitxerDiscs.escriureDisc();
        FitxerDiscs.lleguir();
    }
}
