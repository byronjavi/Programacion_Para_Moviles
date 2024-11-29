/************************************************************************************/
/*Ejercicio #3                                                                      */
/*Solicita un número al usuario y determina si es par o impar                       */
/********************************************************************************** */

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int numero = lectura.nextInt();
        if(numero % 2 == 0)
            System.out.println("El numero " +numero + " es par");
        else
            System.out.println("El numero " +numero + " es impar");
        
    }
}
