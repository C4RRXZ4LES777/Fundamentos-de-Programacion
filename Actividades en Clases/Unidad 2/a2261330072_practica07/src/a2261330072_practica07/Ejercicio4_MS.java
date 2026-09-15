package a2261330072_practica07;

import java.util.Scanner;

public class Ejercicio4_MS {
    public static void main(String args[]) {
        int num;
        String salida;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un Numero");
        num = entrada.nextInt();
        salida = "";
        
        if (num > 0) {
            salida = "Es positivo";
        } else {
            if (num < 0) {
                salida = "Es Negativo";
            } else {
                salida = "Es cero";
            }
        }
        
        System.out.println(salida);
        System.exit(0);
    }
}