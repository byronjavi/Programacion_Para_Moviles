/**********************************************************************************************/
/*Ejercicio #22                                                                               */
/*Números primos:                                                                             */
/*Encuentra e imprime todos los números primos entre 1 y 50.                                  */
/*Salida esperada: 2, 3, 5, 7, ..., 47.                                                       */
/******************************************************************************************** */


import java.util.Scanner;

public class Ejercicio22 
{
    public static void main(String[] args) 
    {
        int contador=0;
        for(int i = 2; i <=50; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if(i%j == 0)
                    contador++;
            }

            if (contador==2) 
            {
                System.out.print(i+" ");
                contador = 0;
            }
            else
            {
                contador = 0;
            }
        }

        
    }
}
