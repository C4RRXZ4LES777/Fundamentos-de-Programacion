package a2261330072_practica07;

import java.util.Scanner;

public class Ejercicio_8_1_mc_scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la tarifa base del servicio:");
        double tarifaBase = entrada.nextDouble();
        
        System.out.println("Seleccione tipo de cliente (1: Profesor [20%], 2: Alumno [10%], 3: General [0%]):");
        int tipoCliente = entrada.nextInt();
        
        double subtotal = tarifaBase * 1.16;
        double descuento = 0.0;
        
        if (tipoCliente == 1) {
            descuento = subtotal * 0.20;
        } else if (tipoCliente == 2) {
            descuento = subtotal * 0.10;
        } else {
            descuento = 0.0;
        }
        
        double total = subtotal - descuento;
        
        System.out.println("--- Resumen de Pago ---");
        System.out.println("Subtotal con IVA (16%): $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
