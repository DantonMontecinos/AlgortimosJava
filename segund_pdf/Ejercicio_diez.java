package primer_semestre.segund_pdf;

/*Desarrollar un programa que muestre la tabla de multiplicar del 3 (del 3 al 30)
public class Ejercicio_diez {
    public static void main(String[]args){

        int numero;
        numero =3;
        for (int i=1; i<=30;i++){

            System.out.println("3"+"*"+i+"="+numero*i);
        }
    }
}

3 - Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos
muestre la tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36

 */

import java.util.Scanner;

public class Ejercicio_diez {
    public static void main(String[]args){

        Scanner entrada ;
        int num;
        System.out.println("Ingresar el numero del cual deseas saber la tabla: ");
        entrada = new Scanner(System.in);
        num = entrada.nextInt();

        for (int i=1; i<=12;i++){

            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
