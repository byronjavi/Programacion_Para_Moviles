/**************************************************************************************************************/
/*Ejercicio #11                                                                                               */
/*Validar contraseñas                                                                                         */
/*Escribe un programa que solicite una contraseña y valide si es correcta (ejemplo: contraseña fija es 12345).*/
/*Ejemplo: Entrada: 12345 → Salida: "Acceso concedido".                                                       */
/**************************************************************************************************************/


import java.util.Scanner;

public class Ejercicio11 
{
    public static void main(String[] args) 
    {
        String pass = "12345";
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese una contraseña");

        String pass2 = lectura.next();

        if(pass.equals(pass2))
            System.out.println("Acceso concedido");
        else
            System.out.println("Acceso denegado");
    }
    
}
