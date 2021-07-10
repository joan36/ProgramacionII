import java.io.*;
import java.util.logging.Logger;

public class File {
    public static void main(String[] args) {

        try {
            int option = 0;

            while (option != 8) {

                menu();
                System.out.println("Insertar Opcio");
                option = LT.readInt();

                switch (option) {
                    case 1:
                        clear();
                        FileOutputStream insertFile = new FileOutputStream("InsertPeliculas.dat");
                        ObjectOutputStream oOUT = new ObjectOutputStream(insertFile);
                        int n = nfiles("Insertar");
                        System.out.println("Inserta " + n + " articles");
                        for (int i = 0; i <= n; i++) {
                            Pelicula p = new Pelicula(id(), titol(), director(), any(), genere(), true);
                            oOUT.writeObject(p);
                        }
                        oOUT.writeObject(Pelicula.centinela);
                        insertFile.close();
                        break;
                    case 2:
                        clear();
                        FileOutputStream updateFile = new FileOutputStream("UpdatePeliculas.dat");
                        ObjectOutputStream uOUT = new ObjectOutputStream(updateFile);
                        n = nfiles("Actualizar");
                        for (int i = 0; i <= n; i++) {
                            Pelicula u = new Pelicula(id(), titol(), director(), any(), genere(), true);
                            uOUT.writeObject(u);

                        }
                        uOUT.writeObject(Pelicula.centinela);
                        updateFile.close();
                        update("Peliculas.dat", "UpdatePeliculas.dat", "NPeliculas.dat", "Peliculas.dat");

                        break;

                    case 3:
                        clear();
                        select("Peliculas.dat");
                        break;
                    case 4:
                        System.out.println("VEU");
                        break;
                    case 5:
                        System.out.println("VEU NOU");
                        break;
                    case 6:
                        System.out.println("ANOM");
                        break;
                    case 7:
                        System.out.println("ANOM");
                        break;
                }

            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static int id() {
        System.out.println("ID");
        return (LT.readInt());
    }

    public static String titol() {
        System.out.println("Nom pelicula");
        return (LT.readLine());
    }

    public static String director() {
        System.out.println("Director Pelicula");
        return (LT.readLine());
    }

    public static Genere genere() {
        System.out.println("Genere");
        System.out.println(java.util.Arrays.asList(Genere.values()));
        return (Genere.valueOf(LT.readLine().toUpperCase()));
    }

    public static int any() {
        System.out.println("Any Estrena");
        return (LT.readInt());
    }

    public static void menu() {
        System.out.println("ACTUALIZACIO");
        System.out.println("1) Inserir article");
        System.out.println("2) Inserir modificacions");
        System.out.println("3) Actualiza articles");
        System.out.println("4) Veure articles");
        System.out.println("5) Veure modificacions");
        System.out.println("6) Veure nous articles");
        System.out.println("7) Veure anomalies");
        System.out.println("8) Sortir");
    }

    public static void clear() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static int nfiles(String operation) {
        System.out.println("Quans articles " + operation);
        int n = LT.readInt();
        return n;
    }

    public static void update(String masterName, String updatesName, String newMaster, String anomaliesName) {
        try {
            //Read Master File
            FileInputStream master = new FileInputStream(masterName);
            ObjectInputStream m = new ObjectInputStream(master);

            //Read Upadte File
            FileInputStream update = new FileInputStream(updatesName);
            ObjectInputStream up = new ObjectInputStream(update);

            //New Master
            FileOutputStream nmaster = new FileOutputStream(newMaster);
            ObjectOutputStream nm = new ObjectOutputStream(nmaster);

            Pelicula p = (Pelicula) m.readObject();
            Pelicula u = (Pelicula) up.readObject();

            while (!p.isSentinel() || !u.isSentinel()) {
                if (p.getId() < u.getId()) {
                    nm.writeObject(p);
                    p = (Pelicula) m.readObject();

                } else if (p.getId() == u.getId()) {
                    nm.writeObject(p);
                } else {

                }

            }
            nm.writeObject(Pelicula.centinela);
            master.close();
            update.close();
            nm.close();

        } catch (Exception e) {

        }
    }


    public static void select(String fileName) {
        try {
            FileInputStream select = new FileInputStream(fileName);
            ObjectInputStream s = new ObjectInputStream(select);
            Pelicula p = (Pelicula) s.readObject();
            while (p.getId() != Pelicula.centinela.getId()) {
                p.toString();
                p = (Pelicula) s.readObject();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
