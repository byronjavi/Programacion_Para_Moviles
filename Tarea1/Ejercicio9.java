/**********************************************************************************************/
/*Ejercicio #8                                                                                */
/*Solicita una edad y clasifica al usuario como niño (0-12), adolescente (13-17), adulto >=18 */
/******************************************************************************************** */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        int suma = 0, resta = 0, multiplicacion = 0, division = 0;

        System.out.println("Ingrese el primer numero");
        int numero1 = lectura.nextInt();

        System.out.println("Ingrese el segundo numero");
        int numero2 = lectura.nextInt();

        System.out.println("Indique la operacion que desea realizar: +   -   x   /");
        String operador = lectura.next();

        if(operador.equals("+"))
        {
            suma = numero1+numero2;
            System.out.println("La suma del numero "+numero1 +" + "+numero2 + " = "+suma);
        }
         
        else if(operador.equals("-"))
        {
            resta = numero1 - numero2;
            System.out.println("La resta del numero "+numero1 +" - "+numero2 + " = "+resta);
        }

        else if(operador.equals("x"))
        {
            multiplicacion = numero1*numero2;
            System.out.println("La multiplicación del numero "+numero1 +" x "+numero2 + " = "+multiplicacion);
        }

        else
        {
            division = numero1/numero2;
            System.out.println("La división del numero "+numero1 +" / "+numero2 + " = "+division);
        }
    }
}
