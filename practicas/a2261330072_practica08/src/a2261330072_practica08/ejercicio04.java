package a2261330072_practica08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio04 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        double operando1, operando2, resultado;
        String menu, cadena;

        System.out.println("Introduce el valor del operando 1: ");
        operando1 = Double.parseDouble(entrada.readLine());

        System.out.println("Introduce el valor del operando 2: ");
        operando2 = Double.parseDouble(entrada.readLine());

        menu = " Menu de opciones de Operaciones Basicas \n"
             + " 1.- Suma \n"
             + " 2.- Multiplicacion \n"
             + " 3.- Division \n"
             + " Elige una Opcion [1..2..3]: ";

        System.out.print(menu);
        opcion = Integer.parseInt(entrada.readLine());

        switch (opcion) {
            case 1:
                resultado = operando1 + operando2;
                cadena = "El resultado de la suma es: " + resultado;
                break;
            case 2:
                resultado = operando1 * operando2;
                cadena = "El resultado de la multiplicacion es: " + resultado;
                break;
            case 3:
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                    cadena = "El resultado de la division es: " + resultado;
                } else {
                    cadena = "Error: Division por cero no permitida.";
                }
                break;
            default:
                cadena = "Opcion no reconocida";
                break;
        }

        System.out.println(cadena);
    }
}