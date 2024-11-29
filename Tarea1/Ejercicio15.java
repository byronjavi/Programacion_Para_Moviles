/*********************************************************************************************************************************/
/*Ejercicio #15                                                                                                                  */
/*Control de acceso:                                                                                                             */
/*Solicita un nombre de usuario y contraseña, y valida si ambos son correctos. Permite tres intentos antes de bloquear el acceso.*/
/*Ejemplo: Entrada: Usuario: admin, Contraseña: 1234 → Salida: "Bienvenido, admin.".                                             */
/*********************************************************************************************************************************/


import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        String user = "admin";
        String pass = "1234";
        int contador = 0;
        String user1 = "";
        String pass1 = "";

        while (contador<3) 
        {
            System.out.println("Por favor ingrese su usuario");
            user1 = lectura.next();
            System.out.println("\nPor favor ingrese su contraseña");   
            pass1 = lectura.next();

            if (user.equals(user1) && pass.equals(pass1)) 
            {
                System.out.println("Bienvenido usuario Admin");
                contador = 10;
            }
            else
            {
                contador++;
                System.out.println("\nUsuario o contraseña incorrecta\n");
            }

            if (contador == 3) 
            {
                System.out.println("Ya no tienes mas intentos");    
            }
        }
        
    }
}
