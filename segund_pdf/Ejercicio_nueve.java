package primer_semestre.segund_pdf;

import java.util.Scanner;

/*
* desarrollar un programa que solicite la carga de 10 numeros e imprima
* la suma de los ultimos 5 ingresados
*
* */
public class Ejercicio_nueve {

    public static void main(String []args){
        Scanner entrada;
        int total, numeros;
        total=0;
        System.out.println("Ingresar 10 numeros: ");
        entrada = new Scanner(System.in);
        for (int i =0; i<10;i++){

            numeros = entrada.nextInt();

            if (i>=5){
                total = total +numeros;
            }
        }
        System.out.println("total de numeros a partir del 5: "+total);

    }
}
