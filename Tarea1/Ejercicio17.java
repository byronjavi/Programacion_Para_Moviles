/**********************************************************************************************/
/*Ejercicio #17                                                                               */
/*Suma de los primeros 10 numeros                                                             */
/******************************************************************************************** */


public class Ejercicio17 {
    public static void main(String[] args) 
    {
        int contador = 0;
        for(int i = 1; i<=10; i++)
        {
            contador+=i;
        }  
        
        System.out.println("La suma de los 10 primeros números es: "+contador);
    }
}
