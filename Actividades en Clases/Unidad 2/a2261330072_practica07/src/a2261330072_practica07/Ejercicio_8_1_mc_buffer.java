package a2261330072_practica07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_8_1_mc_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce la tarifa base del servicio:");
        double tarifaBase = Double.parseDouble(entrada.readLine());
        
        System.out.println("Seleccione tipo de cliente (1: Profesor [20%], 2: Alumno [10%], 3: General [0%]):");
        int tipoCliente = Integer.parseInt(entrada.readLine());
        
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
