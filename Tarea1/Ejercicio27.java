/**********************************************************************************************/
/*Ejercicio #27                                                                               */
/*Suma de dos números:                                                                        */
/*Escribe una función que reciba dos números como parámetros y retorne su suma.               */
/*Ejemplo: Entrada: 3, 7 → Salida: 10.                                                        */
/******************************************************************************************** */


import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        Ejercicio27 nueva = new Ejercicio27();

        System.out.println("Por favor ingrese el primer número");
        int numero1 = lectura.nextInt();

        System.out.println("Por favor ingrese el segundo número");
        int numero2 = lectura.nextInt();

        System.out.println("La suma de los dos números es: "+nueva.sumaDosNumeros(numero1, numero2));
    }

    public int sumaDosNumeros(int n1, int n2)
    {
        int suma = 0;
        suma = n1+n2;
        return suma;
    }
}
