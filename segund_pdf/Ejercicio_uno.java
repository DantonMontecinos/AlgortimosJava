package primer_pdf.segund_pdf;


/*
*Generar un valor aleatorio entre 0 y 1000. Mostrar la cantidad de dígitos que
tiene dicho número
*
* */
public class Ejercicio_uno {

    public static void main(String[]args){

        Generador_random random = new Generador_random();
        random.generar();

    }
}

class Generador_random{
    int random_num;
    public Generador_random() {

        random_num = (int) (Math.random() * 1000);

    }
    public void generar(){

        System.out.println(random_num);

        if (random_num <10){
            System.out.println("El numero tiene 1 digito: "+random_num);
        }else{
            if (random_num>10 && random_num<99){
                System.out.println("El numero tiene 2 digitos: "+random_num);
            }else {
                if (random_num >100 && random_num<999){
                    System.out.println("El numero tiene 3 digitos: "+random_num);
                }else {
                    System.out.println("El numero tiene 5 digitos: "+random_num);
                }
            }
        }
    }
}