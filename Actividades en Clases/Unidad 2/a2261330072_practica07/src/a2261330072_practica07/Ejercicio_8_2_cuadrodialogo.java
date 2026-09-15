package a2261330072_practica07;


import javax.swing.JOptionPane;

public class Ejercicio_8_2_cuadrodialogo {
    public static void main(String[] args) {
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del Lado 1:"));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del Lado 2:"));
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del Lado 3:"));
        
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
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}