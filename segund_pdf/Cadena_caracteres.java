package primer_pdf.segund_pdf;


import java.util.Scanner;

/*Problema:
Solicitar el ingreso del nombre y edad de dos personas. Mostrar el nombre de la persona con
mayor edad

Problema:
Solicitar el ingreso de dos apellidos. Mostrar un mensaje si son iguales o distintos

*/
public class Cadena_caracteres {
    public static void main(String[]args){

        /*
        String nombre1,nombre2;
        int edad1,edad2;
        Scanner entrada;
        entrada = new Scanner(System.in);

        System.out.println("Ingresar nombre: ");
        nombre1 = entrada.nextLine();
        System.out.println("Ingresar edad: ");
        edad1 = entrada.nextInt();
        System.out.println("Ingresar nombre: ");
        entrada.nextLine();
        nombre2 = entrada.nextLine();
        System.out.println("Ingresar edad: ");
        edad2 = entrada.nextInt();

        if (edad1 >edad2){
            System.out.println(nombre1 +" es mayor: "+edad1);
        }else {
            System.out.println(nombre2 +" es mayor: "+edad2);
        }

         */
        Apellidos a = new Apellidos();
        a.igualdad();


    }
}
class Apellidos{
    String nombre1,nombre2;
    Scanner entry;

    public void igualdad(){

        System.out.println("Ingresar apellidos: ");
        entry = new Scanner(System.in);
        nombre1 = entry.next();
        nombre2 = entry.next();

        if (nombre1.equalsIgnoreCase(nombre2)){
            System.out.println("Si son iguales");
        }else{
            System.out.println("Son diferentes");
        }

    }
}

