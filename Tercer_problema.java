package primer_pdf;

/*
* Desarrollar una clase que represente un punto en el plano y tenga los siguientes métodos:
| cargar los valores de x e y,
| imprimir en qué cuadrante se encuentra dicho punto (concepto matemático: primer cuadrante si x
e y son positivas, si x<0 e y>0 segundo cuadrante,tercer x- y- y cuarto cuadrante x+ y- etc.)
* */

import java.util.Scanner;

public class Tercer_problema {

    public static void main(String []args){

        Cuadrantes clase1 = new Cuadrantes();
        clase1.cargar_coordenadas();
        clase1.determina_cuadrante();


    }

}

class Cuadrantes{
    private int x;
    private int y;
    private Scanner entrada;
    public void cargar_coordenadas(){

        entrada = new Scanner(System.in);
        System.out.println("Ingrese la coordenada X: ");
        x=entrada.nextInt();
        System.out.println("Ingrese la coordenada Y: ");
        y=entrada.nextInt();

        System.out.println("La coordenada x: "+x+" Coordenada y: "+y);
    }

    public void determina_cuadrante(){

        if (x>0 && y>0){
            System.out.println("Las coordenadas pertenecen al primer cuadrante: "+x+", "+y);

        }else{
            if (x<0 && y>0){
                System.out.println("Las coordenadas pertenecen al segundo cuadrante: "+x+", "+y);
            }else{
                if (x<0 && y<0){
                    System.out.println("Las coordenadas pertenecen al tercer cuadrante: "+x+", "+y);
                }else{
                    System.out.println("Las coordenadas pertenecen al cuarto cuadrante: "+x+", "+y);
                }
            }
        }
    }
}