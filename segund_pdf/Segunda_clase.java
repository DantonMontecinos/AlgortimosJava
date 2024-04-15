package primer_pdf.segund_pdf;


import java.util.Scanner;

/*
En esta clase veremos los bucles

 */
public class Segunda_clase {

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int pass =0;
        int i=0;

        while (pass !=1234){
            i+=1;
            System.out.println("Ingresar password: ");
            pass = entrada.nextInt();
            if (i==3){
                System.out.println("Bloqueada");
                break;
            }

        }
    }
}
