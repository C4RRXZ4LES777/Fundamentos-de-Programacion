package a2261330072_practica08;


import java.util.Scanner;

public class ejercicio04_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el valor del operando 1: ");
        double operando1 = scanner.nextDouble();

        System.out.println("Introduce el valor del operando 2: ");
        double operando2 = scanner.nextDouble();

        String menu = " Menu de opciones de Operaciones Basicas \n"
                    + " 1.- Suma \n"
                    + " 2.- Multiplicacion \n"
                    + " 3.- Division \n"
                    + " Elige una Opcion [1..2..3]: ";

        System.out.print(menu);
        int opcion = scanner.nextInt();
        String cadena;

        switch (opcion) {
            case 1:
                cadena = "El resultado de la suma es: " + (operando1 + operando2);
                break;
            case 2:
                cadena = "El resultado de la multiplicacion es: " + (operando1 * operando2);
                break;
            case 3:
                if (operando2 != 0) {
                    cadena = "El resultado de la division es: " + (operando1 / operando2);
                } else {
                    cadena = "Error: Division por cero no permitida.";
                }
                break;
            default:
                cadena = "Opcion no reconocida";
                break;
        }

        System.out.println(cadena);
        scanner.close();
    }
}