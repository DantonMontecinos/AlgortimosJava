package primer_semestre.segund_pdf;

import java.util.Scanner;

/*desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre
posteriormente la suma de los valores ingresados y su promedio
**/
public class Ejercicio_siete {
    public static void main(String[]args){

        Scanner teclado;
        int suma,promedio,num;
        suma=0;
        System.out.println("Ingresar 1o numeros: ");
        for (int i=0; i<10;i++){

            teclado = new Scanner(System.in);
            num = teclado.nextInt();

            suma = num+suma;

        }
        promedio = suma/10;
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);

    }
}