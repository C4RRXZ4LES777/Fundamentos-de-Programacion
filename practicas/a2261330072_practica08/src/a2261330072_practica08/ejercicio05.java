package a2261330072_practica08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio05 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String producto1 = "coca cola light lata 400 ml";
        String producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0;
        double precio2 = 15.0;

        String menu = "Menu de Opciones\n"
                    + "1.- Productos\n"
                    + "2.- Punto de venta\n"
                    + "Que opcion deseas: ";

        System.out.print(menu);
        int opc = Integer.parseInt(entrada.readLine());

        switch (opc) {
            case 1:
                System.out.println("El " + producto1 + " cuesta: $" + precio1);
                System.out.println("El " + producto2 + " cuesta: $" + precio2);
                break;

            case 2:
                System.out.print("Introduce la cantidad comprada de " + producto1 + ": ");
                int cant1 = Integer.parseInt(entrada.readLine());

                System.out.print("Introduzca la cantidad comprada de " + producto2 + ": ");
                int cant2 = Integer.parseInt(entrada.readLine());

                double subtotal1 = cant1 * precio1;
                double iva1 = subtotal1 * 0.16;
                double total1 = subtotal1 + iva1;

                System.out.println("\n--- Resumen Producto 1 ---");
                System.out.println("Cantidad: " + cant1 + " de " + producto1);
                System.out.println("Subtotal: \(" + subtotal1 + ", IVA:\)" + iva1 + ", Total: $" + total1);

                double subtotal2 = cant2 * precio2;
                double iva2 = subtotal2 * 0.16;
                double total2 = subtotal2 + iva2;

                System.out.println("\n--- Resumen Producto 2 ---");
                System.out.println("Cantidad: " + cant2 + " de " + producto2);
                System.out.println("Subtotal: \(" + subtotal2 + ", IVA:\)" + iva2 + ", Total: $" + total2);

                double totalSubtotal = subtotal1 + subtotal2;
                double totalIva = iva1 + iva2;
                double totalVenta = total1 + total2;

                System.out.println("\n=== TOTAL DE LA VENTA ===");
                System.out.println("Subtotal General: $" + totalSubtotal);
                System.out.println("IVA General: $" + totalIva);
                System.out.println("Total General: $" + totalVenta);
                break;

            default:
                System.out.println("Elección incorrecta.");
                break;
        }
    }
}
