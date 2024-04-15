package primer_pdf;

import javax.naming.ServiceUnavailableException;
import java.util.Scanner;

public class Sexto_problema {
    public static void main(String[]args){

        Operarios op = new Operarios();
        op.mostrar();

    }
}
class Operarios{

   private Scanner entrada;
   private int[] sueldos;

   public Operarios(){
       sueldos=new int[5];
       entrada=new Scanner(System.in);
       for(int i=0; i<5; i++){

           System.out.println("Ingresar sueldos: ");
           sueldos[i]= entrada.nextInt();
       }

   }
   public void mostrar(){

       for(int i=0; i<5; i++){
           System.out.println(sueldos[i]);
       }

   }

}
