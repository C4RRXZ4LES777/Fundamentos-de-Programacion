package a2261330072_practica08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio01 {
    public static void main(String[] args) throws IOException {
        int num, unidades, decenas;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";

        System.out.print("Introduzca un número (0 a 99): ");
        num = Integer.parseInt(entrada.readLine());

        unidades = num % 10;
        decenas = num / 10;

        switch (decenas) {
            case 0: cadena = ""; break;
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
            case 0: 
                break;
            case 1: 
                if (decenas == 1) cadena = "once";
                else if (decenas > 1) cadena += " y uno";
                else cadena = "uno";
                break;
            case 2:
                if (decenas == 1) cadena = "doce";
                else if (decenas > 1) cadena += " y dos";
                else cadena = "dos";
                break;
            case 3:
                if (decenas == 1) cadena = "trece";
                else if (decenas > 1) cadena += " y tres";
                else cadena = "tres";
                break;
            case 4:
                if (decenas == 1) cadena = "catorce";
                else if (decenas > 1) cadena += " y cuatro";
                else cadena = "cuatro";
                break;
            case 5:
                if (decenas == 1) cadena = "quince";
                else if (decenas > 1) cadena += " y cinco";
                else cadena = "cinco";
                break;
            case 6:
                if (decenas == 1) cadena = "dieciséis";
                else if (decenas > 1) cadena += " y seis";
                else cadena = "seis";
                break;
            case 7:
                if (decenas == 1) cadena = "diecisiete";
                else if (decenas > 1) cadena += " y siete";
                else cadena = "siete";
                break;
            case 8:
                if (decenas == 1) cadena = "dieciocho";
                else if (decenas > 1) cadena += " y ocho";
                else cadena = "ocho";
                break;
            case 9:
                if (decenas == 1) cadena = "diecinueve";
                else if (decenas > 1) cadena += " y nueve";
                else cadena = "nueve";
                break;
        }

        System.out.println(cadena);
    }
}