/**********************************************************************************************/
/*Ejercicio #21                                                                               */
/*Factorial de un número:                                                                     */
/*Calcula el factorial de un número ingresado por el usuario (n!).                            */
/*Ejemplo: Entrada: 5 → Salida: 120.                                                          */
/******************************************************************************************** */


import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese un número para calcular el factorial");
        int numero = lectura.nextInt();
        int contador = 1;

        for(int i = numero; i>0; i--)
        {
            contador = contador*i;
        }

        System.out.println("El factorial de "+numero+" es: "+contador);
    }
}
