package a2261330072_practica08;

import java.util.Scanner;

public class ejercicio02_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = " Menu de Opciones \n"
                    + " 1.- Opcion 1 \n"
                    + " 2.- Opcion 2 \n"
                    + " 3.- Opcion 3 \n"
                    + " 4.- Opcion 4 \n"
                    + " Eliga una opcion [1..4] --> ";

        System.out.print(menu);
        int num = scanner.nextInt();
        String cadena = "";

        switch (num) {
            case 1: cadena = "Elegiste la opcion 1"; break;
            case 2: cadena = "Elegiste la opcion 2"; break;
            case 3: cadena = "Elegiste la opcion 3"; break;
            case 4: cadena = "Elegiste la opcion 4"; break;
            default: cadena = "Elegiste una opcion que no existe"; break;
        }

        System.out.println("\n" + cadena);
        scanner.close();
    }
}