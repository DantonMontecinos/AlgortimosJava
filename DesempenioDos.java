package primer_pdf;

import java.util.Scanner;

/*
 Implementar la clase operaciones. Se deben cargar dos valores enteros,
calcular su suma, resta, multiplicación y división, cada una en un método,
| luego imprimir dichos resultados.
 */
public class DesempenioDos {
    public static void main(String []args){

        Operaciones op = new Operaciones();
        op.suma();
        op.resta();
        op.mult();
        op.division();

    }
}
class Operaciones{

    private int num1;
    private int num2;

    private int resultado;
    private Scanner entrada;


    public void suma(){
        entrada = new Scanner(System.in);

        System.out.println("Ingresar numero 1: ");
        num1 = entrada.nextInt();
        System.out.println("Ingresar numero 2: ");
        num2 = entrada.nextInt();

        resultado = num1+num2;

        System.out.println( "El resultado de la suma es: "+ resultado);

    }
    public void resta(){

        resultado = num1-num2;
        System.out.println( "El resultado de la resta es: "+ resultado);

    }
    public void mult(){
        resultado = num1*num2;
        System.out.println( "El resultado de la multiplicacion es: "+ resultado);
    }
    public void division(){

        while (num1==0){
            System.out.println("Ingresar un numero diferente de 0 (cero) para realizar la division:");
            num1 =entrada.nextInt();
        }

        resultado = num1/num2;
        System.out.println( "El resultado de la division es: "+ resultado);



    }

}