package a2261330072_practica08;

import javax.swing.JOptionPane;

public class ejercicio04_c {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Introduce el valor del operando 1:");
        String input2 = JOptionPane.showInputDialog("Introduce el valor del operando 2:");

        if (input1 != null && input2 != null) {
            double operando1 = Double.parseDouble(input1);
            double operando2 = Double.parseDouble(input2);

            String menu = " Menu de opciones de Operaciones Basicas \n"
                        + " 1.- Suma \n"
                        + " 2.- Multiplicacion \n"
                        + " 3.- Division \n"
                        + " Elige una Opcion [1..2..3]:";

            String inputOpc = JOptionPane.showInputDialog(menu);
            if (inputOpc != null) {
                int opcion = Integer.parseInt(inputOpc);
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

                JOptionPane.showMessageDialog(null, cadena);
            }
        }
    }
}