package primer_pdf.segund_pdf;

import java.util.Scanner;

/* En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada
cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso de datos
debe finalizar al ingresar un valor negativo en el número de cuenta*

De cada cuenta: número de cuenta y estado de la cuenta según su saldo,
sabiendo que:
Estado de la cuenta 'Acreedor' si el saldo es >0.
'Deudor' si el saldo es <0.
'Nulo' si el saldo es =0.
b) La suma total de los saldos acreedores.

/
 */
public class Ejercicio_cinco {
    public static void main(String[]args){

        Banco banco_nacion = new Banco();
        banco_nacion.lector_cuentas();
        banco_nacion.total();


    }
}

class Banco{

    int total,suma;
    int [] saldos;
    int [] cuentas;
    public Banco(){

        cuentas = new int[5];
        saldos = new int[5];

        cuentas[0] =1;
        cuentas[1] =2;
        cuentas[2] =3;
        cuentas[3] =4;
        cuentas[4] =5;

        saldos[0] = 1500;
        saldos[1] = 2500;
        saldos[2]= -5000;
        saldos[3] = 5000;
        saldos[4] = 0;


    }

    public void lector_cuentas() {

        for(int i=0; i<5;i++){
            if (saldos[i]>0){
                System.out.println("Acreedor");
                System.out.println("Numero cuenta: "+cuentas[i]+"\n"+ "Saldo: $"+saldos[i]);
            }else{
                if (saldos[i]<0){
                    System.out.println("Deudor");
                    System.out.println("Numero cuenta: "+cuentas[i]+"\n"+ "Saldo: $"+saldos[i]);
                }else {
                    System.out.println("Cuenta nula");
                    System.out.println("Numero cuenta: "+cuentas[i]+"\n"+ "Saldo: $"+saldos[i]);
                }
            }

        }

    }
    public void total(){

        for(int i=0; i<cuentas.length;i++){

            suma = suma +saldos[i];

        }
        total = suma;
        System.out.println("EL total de cuentas es: "+total);
    }
}

