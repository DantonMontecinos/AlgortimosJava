package primer_pdf;


/*
Problema 05 - Mayor de edad (2)
| Plantear una clase llamada Alumno y definir como atributos su nombre y su edad.
| En el constructor realizar la carga de datos.
| Definir otros dos métodos para imprimir los datos ingresados y un mensaje que indique si es mayor
de edad o no lo es (edad >=18)*/

import java.util.Scanner;

public class Cuarto_problema {

    public static void main(String []args){
        Alumno alumno1= new Alumno();
        alumno1.mostrar_datos();
        alumno1.mayoria_edad();
    }
}
class Alumno{
    Scanner entrada;
    String nombre;
    int edad;

    public Alumno(){
        entrada=new Scanner(System.in);
        System.out.println("Ingresar nombre: ");
        nombre=entrada.nextLine();
        System.out.println("Ingresar edad: ");
        edad=entrada.nextInt();


    }
    public void mostrar_datos(){

        System.out.println("Nombre: "+nombre+", "+"Edad: "+edad);
    }

    public void mayoria_edad(){

        if (edad<18){
            System.out.println("Es menor de edad: "+ edad);
        }else{
            System.out.println("Es mayor de edad: "+ edad);
        }

    }
}
