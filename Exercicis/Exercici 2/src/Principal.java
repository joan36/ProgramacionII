
public class Principal {
    private File file;

    public static void main(String[] args) {





            for (int i = 0; i < 1; i++) {
                System.out.println("-------------------Pelicula " + i + " ------------------------");
                System.out.println("Nom pelicula");
                String titol=(LT.readLine());

                System.out.println("Director Pelicula");
                String director=(LT.readLine());

                System.out.println("Genere");
                System.out.println(java.util.Arrays.asList(Genere.values()));
                Genere genere = Genere.valueOf(LT.readLine().toUpperCase());

                System.out.println("Any Estrena");
                int any=(LT.readInt());

                Pelicula pelicula=new Pelicula(titol,director,any,genere);
                System.out.println(pelicula.toString());
                ObjectOutputStreamFile.esciribrDatos(pelicula);

            }
            ObjectOutputStreamFile.esciribrDatos(Pelicula.centinela);
            //Limipiar pantalla
            clear();

            //Coger objetos
            ObjectInputStreamFile.leerDatos();

    }

    public static void recoirDades() {
        //Variables
        Pelicula pelicula = new Pelicula();



        System.out.println("Director Pelicula");
        pelicula.setNomDirector(LT.readLine());

        System.out.println("Genere");
        System.out.println(java.util.Arrays.asList(Genere.values()));
        String genere = LT.readLine().toUpperCase();
        pelicula.setGenere((Genere.valueOf(genere)));

        System.out.println("Any Estrena");
        pelicula.setAnyEstrena(LT.readInt());


    }

    private static String titol(){
        System.out.println("Nom pelicula");
        return (LT.readLine());
    }

    public static void clear() {
        System.out.println("\n\n\n\n\n\n\n");
    }
}
