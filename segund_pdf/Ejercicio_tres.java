package primer_pdf.segund_pdf;


import java.util.Scanner;

/*


Desarrollar un programa que permita cargar n números enteros y luego nos
informe cuántos valores fueron pares y cuántos impares.
Emplear el operador % en la condición de la estructura condicional:
if (valor%2==0) //Si el if da verdadero luego es par
*/
public class Ejercicio_tres {
    public static void main(String []args){

        Verificador v = new Verificador();
        v.clasificador_numeros();


    }
}
class Verificador{
    Scanner entrada;
    int cantidad_numeros,numeros,pares,impares;

    public Verificador(){
        entrada = new Scanner(System.in);

        System.out.println("ingresar cantidad de numeros para analizar: ");
        cantidad_numeros =entrada.nextInt();
        System.out.println("      --------       ");

    }
    public void clasificador_numeros(){

        for (int i=0; i<cantidad_numeros;i++){

            System.out.println("Ingresar numeros: ");
            numeros = entrada.nextInt();

            if (numeros%2==0){
                pares+=1;
            }else{
                impares+=1;
            }
        }
        System.out.println("Cantidad numeros pares: "+pares);
        System.out.println("Cantidad numeros impares: "+impares);
    }
}
