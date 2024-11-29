/************************************************************************************************************/
/*Ejercicio #10                                                                                             */
/*Determinar si un año es bisiesto (divisible entre 4 pero no entre 100, excepto si es divisible entre 400) */
/********************************************************************************************************** */


import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese un año para determinar si es bisiesto");
        int numero = lectura.nextInt();

        if(numero % 4 == 0 )
        {
            if (numero % 100 == 0) 
            {
                if (numero % 400 == 0) 
                {
                    System.out.println("El año si es bisiesto");
                }
                else
                System.out.println("El año no es bisiesto");
            }
            else
                System.out.println("El año si es bisiesto");
        }
        else
        {
            System.out.println("El año no es bisiesto");
        }
    }
}
