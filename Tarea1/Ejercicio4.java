/************************************************************************************/
/*Ejercicio #4                                                                      */
/*Solicita la calificación de un estudiante y determina si esta aprobado >=7        */
/********************************************************************************** */


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese su calificación");
        float numero = lectura.nextFloat();
        if(numero >= 7)
            System.out.println("Su calificación es " +numero + " usted esta Aprobado");
        else
            System.out.println("Su calificación es " +numero + " usted esta Reprobado");
        
    }
}
