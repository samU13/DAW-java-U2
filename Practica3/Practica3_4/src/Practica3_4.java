import java.util.Scanner;

public class Practica3_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Introduce número de lista del alumno: ");
            int numLista = teclado.nextInt();


            System.out.print("Introduce nota de la primera evaluación: ");
            int notaEval1 = teclado.nextInt();
            while (notaEval1 < 0 || notaEval1 > 10) {
                System.out.print("NOTA NO VÁLIDA. Introduce nota de la primera evaluación: ");
                notaEval1 = teclado.nextInt();
            }


            System.out.print("Introduce nota de la segunda evaluación: ");
            int notaEval2 = teclado.nextInt();
            while (notaEval2 < 0 || notaEval2 > 10) {
                System.out.print("NOTA NO VÁLIDA. Introduce nota de la segunda evaluación: ");
                notaEval2 = teclado.nextInt();
            }


            System.out.print("Introduce nota de la tercera evaluación: ");
            int notaEval3 = teclado.nextInt();
            while (notaEval3 < 0 || notaEval3 > 10) {
                System.out.print("NOTA NO VÁLIDA. Introduce nota de la tercera evaluación: ");
                notaEval3 = teclado.nextInt();
            }


            System.out.print("Introduce número de faltas del alumno: ");
            int numFaltas = teclado.nextInt();


            double notaMedia = (notaEval1 + notaEval2 + notaEval3) / 3.0;


            if (numFaltas < 5)
                notaMedia++;
            else if (numFaltas < 10);
            else if (numFaltas < 15)
                notaMedia--;
            else if (numFaltas < 20)
                notaMedia -= 2;
            else
                notaMedia -= 3;


            if (notaMedia > 10)
                notaMedia = 10;

            if (notaMedia < 0)
                notaMedia = 0;


            System.out.println("Nota media del alumno con número de lista "
                    + numLista + ": " + notaMedia + "\n");
        }
    }
}
