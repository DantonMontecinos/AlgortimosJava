package primer_pdf;


import java.util.Scanner;

/*

Desarrollar una clase que represente a un cuadrado y tenga los siguientes métodos:
cargar el valor de su lado,
imprimir su perímetro y su superficie.

*/
public class Quinto_problema {

    public static void main(String[]args){

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.perimetro();
        cuadrado.superficie();
    }
}

class Cuadrado{
    private Scanner entrada;
    private int lado;
    private int perimetro;

    private int superficie;
    public Cuadrado(){

        entrada = new Scanner(System.in);
        System.out.println("Ingresar lado cuadrado: ");
        lado=entrada.nextInt();
    }
    public void perimetro(){

        perimetro = lado*4;
        System.out.println("El perimetro del cuadrado es: "+ perimetro);

    }
    public void superficie(){

        superficie = lado*2;
        System.out.println("El superficie del cuadrado es: "+superficie);
    }

}
