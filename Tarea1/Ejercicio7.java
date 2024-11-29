/************************************************************************************/
/*Ejercicio #7                                                                      */
/*Solicita 3 número y determina cual es mayor                                       */
/********************************************************************************** */


import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        boolean n = true;
        int numero1 = 0, numero2 = 0, numero3 = 0;

        while (n) 
        {
            System.out.println("Por favor ingrese el primer número");
            numero1 = lectura.nextInt();

            System.out.println("Por favor ingrese el segundo número");
            numero2 = lectura.nextInt();

            System.out.println("Por favor ingrese el tercer número");
            numero3 = lectura.nextInt();

            if (numero1 == numero2 || numero2 == numero3 || numero1 == numero3) 
            {
                System.out.println("Los numeros tienen que ser diferentes");
            }
            else
             n = false;
        }

        if(numero1 > numero2)
        {
            if (numero1 > numero3) 
                System.out.println("El número "+numero1+" es mayor que el número "+numero2+" y mayor que el numero "+numero3);
            else
                System.out.println("El número "+numero3+" es mayor que el número "+numero1+" y mayor que el numero "+numero2);
        }
        else if (numero2 > numero3) 
            System.out.println("El número "+numero2+" es mayor que el número "+numero1+" y mayor que el numero "+numero3);
        else
            System.out.println("El número "+numero3+" es mayor que el número "+numero1+" y mayor que el numero "+numero2);           
    }
}
