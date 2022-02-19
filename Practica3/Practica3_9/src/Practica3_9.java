import java.util.Scanner;

public class Practica3_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("¿Cuantas personas son?: ");
        int numPersonas=teclado.nextInt();
        while(numPersonas<=0) {
            System.out.print("ERROR. ¿Cuantas personas son?: ");
            numPersonas=teclado.nextInt();
        }


        int maximo = 0, minimo = 0;
        int suma = 0;
        for(int i=1; i <= numPersonas; i++) {
            System.out.print("Introduzca la edad de la persona número "+i+" : ");
            int edad=teclado.nextInt();
            while(edad<0){
                System.out.print("ERROR. Introduzca la edad de la persona número "+i+" : ");
                edad=teclado.nextInt();
            }


            if(i==1) {
                maximo=edad;
                minimo=edad;
            }


            if(edad>maximo) {
                maximo=edad;
            }


            if(edad<minimo) {
                minimo=edad;
            }


            suma = suma + edad;
        }


        System.out.println("\nMedia de edades: " + ((double)suma/numPersonas));
        System.out.println("Edad del mayor: " + maximo);
        System.out.println("Edad del menor: " + minimo);
    }
}
