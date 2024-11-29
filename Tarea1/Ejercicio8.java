/**********************************************************************************************/
/*Ejercicio #8                                                                                */
/*Solicita una edad y clasifica al usuario como niño (0-12), adolescente (13-17), adulto >=18 */
/******************************************************************************************** */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese su edad");
        int numero = lectura.nextInt();
        if(numero > 0 && numero <= 12)
            System.out.println("Eres un niño");
        else if(numero >= 13 && numero <=17)
            System.out.println("Eres un Adolescente");
        else
            System.out.println("Eres un Adulto");
    }
}
