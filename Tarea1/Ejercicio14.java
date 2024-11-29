/**********************************************************************************************/
/*Ejercicio #14                                                                               */
/*o	Solicita una calificación numérica y devuelve la letra correspondiente:                   */
/*  90-100: A.                                                                                */
/*  80-89: B.                                                                                 */
/*  70-79: C.                                                                                 */
/*  60-69: D.                                                                                 */
/*  Menor a 60: F.                                                                            */
/******************************************************************************************** */



import java.util.Scanner;

public class Ejercicio14 
{
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingresa tu calificación de 0 - 100");
        int numero = lectura.nextInt();

        if(numero >= 90 && numero <= 100)
            System.out.println("Tu calificación es: A");
        else if(numero >= 80 && numero <=89)
            System.out.println("Tu calificación es: B");
        else if(numero >= 70 && numero <=79)
            System.out.println("Tu calificación es: C");
        else if(numero >= 60 && numero <=69)
            System.out.println("Tu calificación es: D");
        else
            System.out.println("Tu calificación es: F");
        
    }
}
