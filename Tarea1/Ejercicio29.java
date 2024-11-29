/**********************************************************************************************/
/*Ejercicio #29                                                                               */
/*Calcular el cuadrado:                                                                       */
/*Escribe una función que reciba un número y retorne su cuadrado.                             */
/*Ejemplo: Entrada: 5 → Salida: 25                                                            */
/******************************************************************************************** */


import java.util.Scanner;

public class Ejercicio29 
{
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        Ejercicio29 nueva = new Ejercicio29();

        System.out.println("Por favor ingrese un número para calcular su cuadrado");
        int numero = lectura.nextInt();

        System.out.print("El cuadrado de "+numero + " es: " + nueva.cuadrado(numero));

    }

    public int cuadrado(int n)
    {
        return (n*n);
    }
}
