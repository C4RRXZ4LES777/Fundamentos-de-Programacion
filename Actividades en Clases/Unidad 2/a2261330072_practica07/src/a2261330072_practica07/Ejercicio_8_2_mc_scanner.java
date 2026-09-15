package a2261330072_practica07;

import java.util.Scanner;

public class Ejercicio_8_2_mc_scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el valor del Lado 1:");
        double lado1 = entrada.nextDouble();
        System.out.println("Introduce el valor del Lado 2:");
        double lado2 = entrada.nextDouble();
        System.out.println("Introduce el valor del Lado 3:");
        double lado3 = entrada.nextDouble();
        
        String resultado = "";
        
        if (lado1 == lado2 && lado2 == lado3) {
            resultado = "Es un Triángulo Equilátero";
        }
        if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
            resultado = "Es un Triángulo Isósceles";
        }
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            resultado = "Es un Triángulo Escaleno";
        }
        
        System.out.println(resultado);
    }
}