import java.util.Scanner;

public class Practica3_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce código del trabajador: ");
        int codigo = teclado.nextInt();

        while (codigo != 0) {

            System.out.print("Introduce número de hijos: ");
            int numHijos = teclado.nextInt();

            System.out.print("Introduce horas no trabajadas: ");
            int horas = teclado.nextInt();


            double gratificacionHijos = switch (numHijos) {
                case 0 -> 180;
                case 1 -> 240;
                case 2 -> 300;
                default -> 360;
            };


            double gratificacionAsistencia = 360 - horas * 9;
            if (gratificacionAsistencia < 0) {
                gratificacionAsistencia = 0;
            }


            System.out.println("---------------------------------------");
            System.out.println("Código del trabajador: " + codigo);
            System.out.println("Gratificación por hijos: " + gratificacionHijos);
            System.out.println("Gratificación por asistencia al trabajo: "
                    + gratificacionAsistencia);
            System.out.println("---------------------------------------");
            System.out.println();

            System.out.print("Introduce código del trabajador: ");
            codigo = teclado.nextInt();
        }
    }
}
