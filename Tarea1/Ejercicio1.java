/************************************************************************************/
/*Ejercicio #1                                                                      */
/*Escribe un programa que solicite un numero y determine si es mayor o menor que 10 */
/********************************************************************************** */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int numero = lectura.nextInt();
        if(numero == 10)
            System.out.println("El numero " +numero + " es igual a 10");
        else if(numero > 10)
            System.out.println("El numero " +numero + " es mayor que 10");
        else
            System.out.println("El numero " +numero + " es menor que 10");
    }
}