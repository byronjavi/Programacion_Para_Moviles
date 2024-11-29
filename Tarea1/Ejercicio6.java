/************************************************************************************/
/*Ejercicio #6                                                                      */
/*Solicita la edad del usuario y determina si es elegible para votar >= 18 años     */
/********************************************************************************** */


import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese su edad");
        int numero = lectura.nextInt();
        if(numero >= 18)
        {
            System.out.println("Su edad es: "+numero + " años, " + "usted puede votar");
        }
            
        else
        System.out.println("Su edad es: "+numero + " años, " + "usted no puede votar");
        
    }
}
