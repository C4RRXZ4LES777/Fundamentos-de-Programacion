package a2261330072_practica08;


import javax.swing.JOptionPane;

public class ejercicio05_c {
    public static void main(String[] args) {
        String producto1 = "coca cola light lata 400 ml";
        String producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0;
        double precio2 = 15.0;

        String menu = "Menu de Opciones\n"
                    + "1.- Productos\n"
                    + "2.- Punto de venta\n"
                    + "Que opcion deseas:";

        String inputOpc = JOptionPane.showInputDialog(menu);
        if (inputOpc != null) {
            int opc = Integer.parseInt(inputOpc);

            switch (opc) {
                case 1:
                    String info = "El " + producto1 + " cuesta: $" + precio1 + "\n"
                                + "El " + producto2 + " cuesta: $" + precio2;
                    JOptionPane.showMessageDialog(null, info);
                    break;

                case 2:
                    String input1 = JOptionPane.showInputDialog("Introduce la cantidad comprada de " + producto1 + ":");
                    String input2 = JOptionPane.showInputDialog("Introduzca la cantidad comprada de " + producto2 + ":");

                    if (input1 != null && input2 != null) {
                        int cant1 = Integer.parseInt(input1);
                        int cant2 = Integer.parseInt(input2);

                        double subtotal1 = cant1 * precio1;
                        double iva1 = subtotal1 * 0.16;
                        double total1 = subtotal1 + iva1;

                        double subtotal2 = cant2 * precio2;
                        double iva2 = subtotal2 * 0.16;
                        double total2 = subtotal2 + iva2;

                        double totalSubtotal = subtotal1 + subtotal2;
                        double totalIva = iva1 + iva2;
                        double totalVenta = total1 + total2;

                        String resumen = "=== DETALLE DE VENTA ===\n\n"
                                + "Producto 1: " + producto1 + "\n"
                                + "Cantidad: " + cant1 + " | Subtotal: \(" + subtotal1 + " | IVA:\)" + iva1 + " | Total: $" + total1 + "\n\n"
                                + "Producto 2: " + producto2 + "\n"
                                + "Cantidad: " + cant2 + " | Subtotal: \(" + subtotal2 + " | IVA:\)" + iva2 + " | Total: $" + total2 + "\n\n"
                                + "=== TOTALES GENERALES ===\n"
                                + "Subtotal: $" + totalSubtotal + "\n"
                                + "IVA: $" + totalIva + "\n"
                                + "Total Venta: $" + totalVenta;

                        JOptionPane.showMessageDialog(null, resumen);
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Elección incorrecta.");
                    break;
            }
        }
    }
}
