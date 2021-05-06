import java.text.ParseException;

public class Data {
    private int dia;
    private int mes;
    private int any;
    private int hora;
    private int minuts;

    public Data() {
    }

    public Data(int dia, int mes, int any, int hora, int minuts) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
        this.hora = hora;
        this.minuts = minuts;
    }

    public Data(String s) {
    }




    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public static void creadData(String dataString) throws ParseException {
    }

    public static Data objecteData(String d1) {
        int dia, mes, any, hora, minut;
        char[] date1 = d1.toCharArray();

        for (int i = 0; i < date1.length; i++) {
            if (date1[i] == ' ' || date1[i] == ':') {
                date1[i] = '/';
            }
        }

        String[] Novadata1 = String.valueOf(date1).split("/");
        dia=Integer.parseInt(Novadata1[0]);
        mes=Integer.parseInt(Novadata1[1]);
        any=Integer.parseInt(Novadata1[2]);
        hora=Integer.parseInt(Novadata1[3]);
        minut=Integer.parseInt(Novadata1[4]);

        Data data=new Data(dia,mes,any,hora,minut);

        return data;
    }

    public static boolean compararData(Data d1, Data d2){

        String num1=String.valueOf(d1.any)+String.valueOf(d1.mes)+String.valueOf(d1.dia)+String.valueOf(d1.hora)+String.valueOf(d1.minuts);
        String num2=String.valueOf(d1.any)+String.valueOf(d1.mes)+String.valueOf(d1.dia)+String.valueOf(d1.hora)+String.valueOf(d1.minuts);

        if (Integer.parseInt(num2) > Integer.parseInt(num1)){
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return dia + "/" + mes + "/" + any + " " + hora + ":" + minuts;
    }
}
