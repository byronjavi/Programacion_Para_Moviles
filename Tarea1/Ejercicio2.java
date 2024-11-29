/************************************************************************************/
/*Ejercicio #2                                                                      */
/*Solicita al usuario un numero y determina si es positivo, negativo o cero         */
/********************************************************************************** */


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int numero = lectura.nextInt();
        if(numero == 0)
            System.out.println("El numero " +numero + " es igual a cero");
        else if(numero > 0)
            System.out.println("El numero " +numero + " es positivo");
        else
            System.out.println("El numero " +numero + " es negativo");
    }
}
