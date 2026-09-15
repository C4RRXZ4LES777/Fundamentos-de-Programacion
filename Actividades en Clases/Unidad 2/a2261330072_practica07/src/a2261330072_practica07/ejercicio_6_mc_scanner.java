package a2261330072_practica07;

import java.util.Scanner;

public class ejercicio_6_mc_scanner {
    public static void main(String args[]) {
        Scanner lectura = new Scanner(System.in);
        int parcial1, parcial2, parcial3;
        double resultado;
        String salida = "";
        
        System.out.println("Introduce la calificacion del Parcial 1");
        parcial1 = lectura.nextInt();
        System.out.println("Introduce la calificacion del Parcial 2");
        parcial2 = lectura.nextInt();
        System.out.println("Introduce la calificacion del Parcial 3");
        parcial3 = lectura.nextInt();
        
        resultado = (double) (parcial1 + parcial2 + parcial3) / 3;
        
        if (resultado >= 7) {
            salida = "ALUMNO ACREDITADO";
        } else {
            salida = "ALUMNO NO ACREDITADO";
        }
        
        System.out.println(salida);
    }
}