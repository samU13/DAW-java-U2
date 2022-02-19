import java.util.Scanner;

public class Practica1_6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el salario bruto: ");
        float salarioBruto = teclado.nextFloat();
        System.out.print("Introduce el número de hijos: ");
        int numHijos = teclado.nextInt();

        int retenciones;


        if (numHijos <= 2){
            retenciones = 20;
        } else if (numHijos <= 5){
            retenciones = 15;
        } else if (numHijos <= 7){
            retenciones = 10;
        } else if (numHijos <= 9){
            retenciones = 5;
        } else{
            retenciones = 0;
        }

        float descuento = salarioBruto * retenciones / 100;
        float salarioNeto = salarioBruto - descuento;

        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Descuento: " + descuento
                + " (" + retenciones + "%)");
        System.out.println("Salario neto: " +  salarioNeto);
    }
}
