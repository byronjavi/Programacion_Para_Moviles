/**********************************************************************************************/
/*Ejercicio #30                                                                               */
/*Calcular el área de un círculo:                                                             */
/*Crea una función que reciba el radio de un círculo y retorne su área.                       */
/*Fórmula: Área = π * radio^2.                                                                */
/*Ejemplo: Entrada: 3 → Salida: 28.27 (aproximado).                                           */
/******************************************************************************************** */



import java.util.Scanner;

public class Ejercicio30 
{
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        Ejercicio30 nueva = new Ejercicio30();

        System.out.println("Por favor ingrese el radio del circulo");
        int numero = lectura.nextInt();

        System.out.print("El area del circulo con radio "+numero + " es: " + nueva.areaDeUnCirculo(numero));
    }

    private double areaDeUnCirculo(int radio)
    {
        double pi = 3.141592;
        return (pi*radio*radio);
    }
}
