package a2261330072_practica07;

import javax.swing.JOptionPane;

public class Ejercicio_8_1_cuadrodialogo {
    public static void main(String[] args) {
        double tarifaBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tarifa base del servicio:"));
        int tipoCliente = Integer.parseInt(JOptionPane.showInputDialog("Seleccione tipo de cliente:\n1: Profesor (20% Desc)\n2: Alumno (10% Desc)\n3: General (0% Desc)"));
        
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
        
        String mensaje = "--- Resumen de Pago ---\n" +
                         "Subtotal con IVA (16%): $" + subtotal + "\n" +
                         "Descuento: $" + descuento + "\n" +
                         "Total a pagar: $" + total;
                         
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
