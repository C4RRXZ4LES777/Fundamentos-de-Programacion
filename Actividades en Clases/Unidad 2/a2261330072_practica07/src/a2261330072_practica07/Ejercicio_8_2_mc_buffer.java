package a2261330072_practica07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_8_2_mc_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce el valor del Lado 1:");
        double lado1 = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el valor del Lado 2:");
        double lado2 = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el valor del Lado 3:");
        double lado3 = Double.parseDouble(entrada.readLine());
        
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