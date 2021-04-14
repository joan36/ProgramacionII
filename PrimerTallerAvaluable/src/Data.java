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

    public static Data creadData(String dataString){
        char[] data=dataString.toCharArray();
        Data d=new Data();
        //Dia
        String dia= String.valueOf(data[0])+String.valueOf(data[1]);
        d.setDia(Integer.parseInt(dia));
        //Mes
        String mes= String.valueOf(data[3])+String.valueOf(data[4]);
        d.setMes(Integer.parseInt(mes));
        //Any
        String any= String.valueOf(data[6])+String.valueOf(data[7]);
        d.setAny(Integer.parseInt(any));

        //Hora
        String hora= String.valueOf(data[9])+String.valueOf(data[10]);
        d.setHora(Integer.parseInt(hora));

        //Minuts
        String minuts= String.valueOf(data[12])+String.valueOf(data[13]);
        d.setMinuts(Integer.parseInt(minuts));
        return d;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+any+" "+hora+":"+minuts;
    }
}
