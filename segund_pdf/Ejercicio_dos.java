package primer_pdf.segund_pdf;

/*Se ingresan un conjunto de n alturas de personas por teclado, ingresar n por
teclado. Mostrar la altura promedio de las personas
*/

import java.util.Scanner;

public class Ejercicio_dos {
    public static void main(String[]args){

        Alturas a = new Alturas();
        a.promedio();

    }
}
class Alturas{
    Scanner entrada;
    double cantidad_alturas,alturas,suma,total;


    public Alturas(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese cantidad de alturas para analizar: ");
        cantidad_alturas = entrada.nextDouble();


    }

    public void promedio(){

        for (int i=0; i<cantidad_alturas;i++){

            System.out.println("Ingresar alturas: ");
            alturas=entrada.nextDouble();

            suma = suma+alturas;
        }

        total = suma/cantidad_alturas;
        System.out.println("Promedio total de alturas: "+total);

    }

}
