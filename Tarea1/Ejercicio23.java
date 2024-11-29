/**********************************************************************************************/
/*Ejercicio #23                                                                               */
/*Sumar dígitos:                                                                              */
/*Solicita un número entero y calcula la suma de sus dígitos.                                 */
/*Ejemplo: Entrada: 123 → Salida: 6 (1 + 2 + 3).                                              */ 
/******************************************************************************************** */


import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese un número de dos digitos o mas");
        String numero = lectura.next();
        int suma = 0;

        for(int i = 0; i < numero.length(); i++)
        { 
            suma = suma + Integer.parseInt(numero.valueOf(numero.charAt(i)));
            if(i+1==numero.length())
                System.out.print(numero.charAt(i));
            else
                System.out.print(numero.charAt(i)+" + ");
        }
        System.out.print(" = "+suma);
    }
}
