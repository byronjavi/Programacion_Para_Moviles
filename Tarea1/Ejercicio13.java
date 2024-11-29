/**********************************************************************************************/
/*Ejercicio #13                                                                               */
/*13.	Calcular el signo zodiacal:                                                           */
/*Solicita el día y mes de nacimiento y determina el signo zodiacal del usuario.              */
/*Ejemplo: Entrada: 22, marzo → Salida: "Tu signo es Aries".                                  */
/******************************************************************************************** */


import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el día de nacimiento");
        int dia = lectura.nextInt();
        int mes = 0;
        boolean bandera = true;

        while (bandera) 
        {    
            System.out.println("De acuerdo al listado, seleccione el mes de macimiento");
            System.out.println("1\tEnero");
            System.out.println("2\tFebrero");
            System.out.println("3\tMarzo");
            System.out.println("4\tAbril");
            System.out.println("5\tMayo");
            System.out.println("6\tJunio");
            System.out.println("7\tJulio");
            System.out.println("8\tAgosto");
            System.out.println("9\tSeptiembre");
            System.out.println("10\tOctubre");
            System.out.println("11\tNoviembre");
            System.out.println("12\tDiciembre");

            mes = lectura.nextInt();

            if (mes >= 1 && mes <= 12) 
                bandera = false;
            else
                System.out.println("Debe seleccionar un numero entre 1 - 12 que represente al mes\n");
        }

        
        if(mes==3)
        {
            if(dia >= 21)
                System.out.println("Tu signo es Aries");
            else
                System.out.println("Tu signo es Piscis");
        }

        if(mes==4)
        {
            if(dia >= 21)
                System.out.println("Tu signo es Tauro");
            else
                System.out.println("Tu signo es Aries");
        }

        if(mes==5)
        {
            if(dia >= 21)
                System.out.println("Tu signo es Géminis");
            else
                System.out.println("Tu signo es Tauro");
        }

        if(mes==6)
        {
            if(dia >= 21)
                System.out.println("Tu signo es Cáncer");
            else
                System.out.println("Tu signo es Géminis");
        }

        if(mes==7)
        {
            if(dia >= 23)
                System.out.println("Tu signo es Leo");
            else
                System.out.println("Tu signo es Cáncer");
        }

        if(mes==8)
        {
            if(dia >= 24)
                System.out.println("Tu signo es Virgo");
            else
                System.out.println("Tu signo es Leo");
        }

        if(mes==9)
        {
            if(dia >= 23)
                System.out.println("Tu signo es Libra");
            else
                System.out.println("Tu signo es Virgo");
        }

        if(mes==10)
        {
            if(dia >= 24)
                System.out.println("Tu signo es Escorpio");
            else
                System.out.println("Tu signo es Libra");
        }

        if(mes==11)
        {
            if(dia >= 23)
                System.out.println("Tu signo es Sagitario");
            else
                System.out.println("Tu signo es Escorpio");
        }

        if(mes==12)
        {
            if(dia >= 22)
                System.out.println("Tu signo es Capricornio");
            else
                System.out.println("Tu signo es Sagitario");
        }

        if(mes==1)
        {
            if(dia >= 21)
                System.out.println("Tu signo es Acuario");
            else
                System.out.println("Tu signo es Capricornio");
        }

        if(mes==2)
        {
            if(dia >= 20)
                System.out.println("Tu signo es Piscis");
            else
                System.out.println("Tu signo es Acuario");
        }

    }
}
