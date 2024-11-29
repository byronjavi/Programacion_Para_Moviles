/**********************************************************************************************/
/*Ejercicio #18                                                                               */
/*Tabla de multiplicar:                                                                       */
/*Solicita un número al usuario y muestra su tabla de multiplicar del 1 al 10.                */
/*Ejemplo: Entrada: 5 → Salida: 5 x 1 = 5, ..., 5 x 10 = 50                                   */
/******************************************************************************************** */


import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        int numero = 0;
        boolean bandera = true;
        System.out.println("*** Este programa permite calcular la tabla de multiplicar del 1 al 10 ***");

        while (bandera) 
        {
            System.out.println("Por favor ingrese un número para calcular la tabla de multiplicar");
            numero = lectura.nextInt();

            if (numero >=1 && numero <=10) 
                bandera = false;
            else
                System.out.println("Debe ingresar un numero entre 1 y 10");
        }
        
        int multiplo = 0;

        for(int i = 1; i <= 12; i++)
        {
            multiplo = numero*i;
            System.out.println(numero +" x "+ i + " = "+multiplo);
        }    
    }
}
