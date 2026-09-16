package a2261330072_practica08;

import javax.swing.JOptionPane;

public class ejercicio01_c {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduzca un número (0 a 99):");
        if (input != null) {
            int num = Integer.parseInt(input);
            int unidades = num % 10;
            int decenas = num / 10;
            String cadena = "";

            switch (decenas) {
                case 1: cadena = "diez"; break;
                case 2: cadena = "veinte"; break;
                case 3: cadena = "treinta"; break;
                case 4: cadena = "cuarenta"; break;
                case 5: cadena = "cincuenta"; break;
                case 6: cadena = "sesenta"; break;
                case 7: cadena = "setenta"; break;
                case 8: cadena = "ochenta"; break;
                case 9: cadena = "noventa"; break;
            }

            switch (unidades) {
                case 0: break;
                case 1: cadena = (decenas == 1) ? "once" : (decenas > 1 ? cadena + " y uno" : "uno"); break;
                case 2: cadena = (decenas == 1) ? "doce" : (decenas > 1 ? cadena + " y dos" : "dos"); break;
                case 3: cadena = (decenas == 1) ? "trece" : (decenas > 1 ? cadena + " y tres" : "tres"); break;
                case 4: cadena = (decenas == 1) ? "catorce" : (decenas > 1 ? cadena + " y cuatro" : "cuatro"); break;
                case 5: cadena = (decenas == 1) ? "quince" : (decenas > 1 ? cadena + " y cinco" : "cinco"); break;
                case 6: cadena = (decenas == 1) ? "dieciséis" : (decenas > 1 ? cadena + " y seis" : "seis"); break;
                case 7: cadena = (decenas == 1) ? "diecisiete" : (decenas > 1 ? cadena + " y siete" : "siete"); break;
                case 8: cadena = (decenas == 1) ? "dieciocho" : (decenas > 1 ? cadena + " y ocho" : "ocho"); break;
                case 9: cadena = (decenas == 1) ? "diecinueve" : (decenas > 1 ? cadena + " y nueve" : "nueve"); break;
            }

            JOptionPane.showMessageDialog(null, cadena);
        }
    }
}
