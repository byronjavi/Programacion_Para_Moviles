/**********************************************************************************************/
/*Ejercicio #26                                                                               */
/*Saludo personalizado:                                                                       */
/*Crea una función que reciba un nombre como parámetro y retorne un saludo.                   */
/*Ejemplo: Entrada: María → Salida: "Hola, María!".                                           */
/******************************************************************************************** */



import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) 
    {
        Ejercicio26 nueva = new Ejercicio26();
        String nombre = "";
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        nombre = lectura.nextLine();
        System.out.println(nueva.saludoPersonalizado(nombre));
    }

    public String saludoPersonalizado(String n)
    {
        String saludo = "Hola, ";
        saludo = saludo.concat(n).concat("!");
        return saludo;
    }
}
