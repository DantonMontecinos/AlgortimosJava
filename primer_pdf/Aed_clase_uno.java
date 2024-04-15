package primer_pdf;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Aed_clase_uno {


    public static void main(String[]args){


        /*Primer_problema p = new Primer_problema();
        p.cargar_datos();
        p.imprimir();
    */

        segundo_problema p = new segundo_problema();
        p.cargar_datos();
        p.lado_mayor();
        p.equilater();
    }

}

class Primer_problema{

    String nombre;
    public int edad;
    public void cargar_datos(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar nombre: ");
        nombre = entrada.next();

        System.out.println("Ingresar edad: ");
        edad = entrada.nextInt();

    }
    public void imprimir(){

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }


}

class segundo_problema{

    int lado1,lado2,lado3;
    Scanner entrada;

    public void cargar_datos(){

        entrada = new Scanner(System.in);
        System.out.println("Ingresar lado 1: ");
        lado1 = entrada.nextInt();
        System.out.println("Ingresar lado 2: ");
        lado2 =entrada.nextInt();
        System.out.println("Ingresar lado 3 ");
        lado3 =entrada.nextInt();



    }
    public void lado_mayor() {

        if (lado1 > lado2 && lado1 > lado3) {
            System.out.println("Lado 1 es mayor " + lado1);

        } else {
            if (lado2 > lado3) {
                System.out.println("Lado 2 es mayor " + lado2);
            } else {
                System.out.println("Lado 3 es mayor " + lado3);
            }
        }
    }

    public void equilater(){
        if (lado1==lado2 && lado1==lado3  && lado2==lado3){

            System.out.println("Es equilatero");

        }else{
            System.out.println( "No es equilatero");
        }

    }

}



