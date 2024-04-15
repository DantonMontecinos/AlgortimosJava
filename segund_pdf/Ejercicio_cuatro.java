package primer_pdf.segund_pdf;

import java.util.Scanner;

import java.sql.SQLOutput;

/*1 - Realizar un programa que acumule (sume) valores ingresados por teclado hasta
ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga). Imprimir
el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.*/
public class Ejercicio_cuatro {
    public static void main(String[]args){

        Clasificador c = new Clasificador();
        c.Carga_numeros();
    }
}
class Clasificador{
    Scanner entrada;
    int numeros,suma,total,contador;

    public void Carga_numeros(){
        entrada = new Scanner(System.in);
        int i=9999;
        while (i != numeros){

            System.out.println("Ingresar numeros: ");
            numeros=entrada.nextInt();
            if (numeros==9999){
                break;
            }
            suma = suma+numeros;


        }
        if (suma==0){

            System.out.println("Igual a cero: "+suma);
        }else{
            if(suma>0){
                System.out.println("Mayor a cero: "+suma);
            }else{
                System.out.println("Menor a cero: "+suma);
            }
        }

        System.out.println("Finalizó la carga de numeros");
        System.out.println("Total valor acumulado: "+suma);


    }

}