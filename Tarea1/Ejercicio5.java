/************************************************************************************/
/*Ejercicio #5                                                                      */
/*Una tienda ofrece el 20% de descuento si el cliente gasta mas de $100 dolares     */
/*Escriba un programa que calcule el monto final                                    */
/********************************************************************************** */


import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad gastada en su compra");
        float numero = lectura.nextFloat();
        float descuento;
        if(numero > 100)
        {
            descuento = numero - ((numero*20)/100);
            System.out.println("Se le realizará un descuento del 20%, solo debe cancelar: "+descuento);
        }
            
        else
            System.out.println("Usted no posee ningun descuento, su valor a cancelar es: "+numero);
        
    }
}
