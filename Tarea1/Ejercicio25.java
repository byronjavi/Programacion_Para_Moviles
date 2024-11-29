/**********************************************************************************************/
/*Ejercicio #25                                                                               */
/*Promedio de calificaciones:                                                                 */
/*Solicita calificaciones al usuario (hasta que ingrese -1) y calcula el promedio.            */
/*Ejemplo: Entradas: 5, 7, 8, -1 → Salida: Promedio: 6.67.                                    */
/******************************************************************************************** */


import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        boolean bandera = true;
        float promedio = 0;
        float calificacion = 0;
        int contador = 0;
        
        while (bandera) 
        {
            System.out.println("Por favor ingrese sus calificaciones una por una presionando enter");
            System.out.println("Para saber el promedio presione -1");

            calificacion = lectura.nextFloat();

            if (calificacion == -1.0) 
            {
                System.out.println("El promedio es: "+(promedio / contador));
                bandera = false;
            }
            else
            {
                promedio = promedio + calificacion;
                contador++;
            }
        }
            
    }
}
