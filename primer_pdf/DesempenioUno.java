package primer_pdf;

/*
Confeccionar una clase que represente un empleado. Definir como
atributos su nombre y su sueldo.
| Confeccionar los métodos para la carga, otro para imprimir sus datos
y por último uno que imprima un mensaje en caso que deba pagar
impuestos (si el sueldo supera a los $3000).
*/

import java.util.Scanner;

public class DesempenioUno {
    public static void main(String[]args){
        Empleado empleado1 = new Empleado("Lia", 2999);
        System.out.println("Nombre: "+empleado1.getNombre());
        System.out.println("Sueldo: "+empleado1.getSueldo());
        empleado1.impuestos();
    }
}
/*
class Empleado{

    String nombre;
    int sueldo;
    Scanner entrada;

    public void cargarDatos(){

        entrada=new Scanner(System.in);
        System.out.println("Ingresar nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar sueldo: ");
        sueldo=entrada.nextInt();

    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo: "+sueldo);

        if (sueldo>3000){
            System.out.println("Debe pagar impuestos: "+sueldo);

        }else{
            System.out.println("No debe pagar impuesto: "+ sueldo);
        }
    }
}

*
* RESOLUCION DEL EJERCICIO CON PARAMETROS +
*
*
*/

class Empleado{

    String nombre;
    int sueldo;

    public Empleado(String nomb, int sueld){

        nombre = nomb;
        sueldo=sueld;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void impuestos(){

        if (sueldo>3000){
            System.out.println("Debe pagar impuestos: "+sueldo);
        }else{
            System.out.println("No debe pagar impuestos: "+sueldo);
        }

    }

}

