/**********************************************************************************************/
/*Ejercicio #28                                                                               */
/*Número par o impar:                                                                         */
/*Crea una función que reciba un número y retorne True si es par y False si es impar.         */
/*Ejemplo: Entrada: 4 → Salida: True.                                                         */
/******************************************************************************************** */

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        Ejercicio28 nueva = new Ejercicio28();

        System.out.println("Por favor ingrese un número para identificar si es par o impar");
        int numero = lectura.nextInt();

        System.out.print(nueva.parImpar(numero));

    }

    public boolean parImpar(int n)
    {
        if (n%2==0) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
