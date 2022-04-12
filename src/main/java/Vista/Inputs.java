package Vista;

import java.util.Scanner;

public class Inputs {
    static Scanner sc = new Scanner(System.in);

    public static int num(String mensaje){
        int dato=0;
        boolean valido= false;
        do {
            try {
                System.out.print(mensaje);
                dato = sc.nextInt();
                valido = true;
            } catch (java.util.InputMismatchException e) {
                valido = false;
                sc.useDelimiter("\n");
                sc.next();
            }
        }while(!valido);
        return dato;
    }
    public static Boolean Boolean(String mensaje){
        boolean dato= false;
        boolean valido= false;
        do {
            try {
                System.out.print(mensaje);
                dato = sc.nextBoolean();
                valido = true;
            } catch (java.util.InputMismatchException e) {
                valido = false;
                sc.useDelimiter("\n");
                sc.next();
            }
        }while(!valido);
        return dato;
    }
    public static String String(String mensaje) {
        String cad = "";

        System.out.print(mensaje);
        cad = sc.next();

        return cad;
    }

    public static String letra(String mensaje){
        String c;
        System.out.println(mensaje);
        c=sc.next();
        return c;

    }
}
