package primer_semestre.segund_pdf;

import java.util.Scanner;

/*Escribir un programa que lea 10 enteros y luego muestre cuantos
 valores ingresados fueron multiplos de 3 y cuantos de 5*/
public class Ejercicio_ocho {
    public static void main(String[]args){
        Scanner teclado;
        int cinco,tres,valores;
        cinco=0;
        tres=0;
        System.out.println("Ingresar 5 valores: ");
        for (int i=0; i<5;i++){
            teclado = new Scanner(System.in);
            valores = teclado.nextInt();


            if (valores%5 == 0){
                cinco +=1;
            }

            if (valores%3==0){
                tres+=1;
            }

        }
        System.out.println("Valores multiplos 5: "+cinco);
        System.out.println("Valores multiplos 3: "+tres);

    }
}
