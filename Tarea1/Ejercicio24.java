/**********************************************************************************************/
/*Ejercicio #24                                                                               */
/*Invertir un número:                                                                         */
/*Solicita un número entero y muestra su versión invertida.                                   */
/*Ejemplo: Entrada: 1234 → Salida: 4321.                                                      */
/******************************************************************************************** */


import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese un número entero de dos digitos o mas");
        String numero = lectura.next();
        String resultado = "";

        for(int i = numero.length()-1; i >=0; i--)
        { 
            resultado = resultado.concat(numero.valueOf(numero.charAt(i)));

        }
        System.out.println(resultado);
    }
}
