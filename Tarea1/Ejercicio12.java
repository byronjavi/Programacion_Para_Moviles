/*****************************************************************************************************************************/
/*Ejercicio #12                                                                                                              */
/*Juego de números:                                                                                                          */
/*Genera un número aleatorio entre 1 y 10 y solicita al usuario que adivine el número. Usa if para verificar si acertó o no. */
/*Ejemplo: Entrada: 5 → Salida: "¡Felicidades, acertaste!" o "Intenta de nuevo.".                                            */
/*****************************************************************************************************************************/


import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) 
    {
        int aleatorio = 0;
        aleatorio = (int) (Math.random() * 10) + 1;
        int numero = 0;
        boolean bandera = true;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Programa de adivinar un número");
        
        while (bandera) 
        {
            System.out.println("Por favor ingrese un número");
            numero = lectura.nextInt();
            
            if(numero == aleatorio)
            {
                System.out.println("¡Felicidades, acertaste!");
                bandera = false;
            }
            else
            {
                System.out.println("El numero es incorrecto...\n");
            }
        }
    }
}
