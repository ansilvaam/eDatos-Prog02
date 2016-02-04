
import java.util.Scanner;

//Programa 2
public class Main {

    public static void main(String[] args) {

        int valor, num1, num2, suma1, suma2, suma3, suma4, resultado;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la Matriz: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el tamaño de la Matriz: ");
        num2 = leer.nextInt();

        int[][] Matriz = new int[num1][num2];

        if (Matriz.length == Matriz[0].length) {
            System.out.println("Es cuadrada, podemos continuar");
        } else {
            System.out.println("No es cuadrada, saliendo...");
            System.exit(0);
        }

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {

                System.out.println("Ingresa: ");
                valor = leer.nextInt();

                Matriz[i][j] = valor;
            }
        }

        System.out.println("Imprime matriz: ");

        for (int i = 0; i < Matriz.length; i++) {

            for (int j = 0; j < Matriz[0].length; j++) {

                System.out.print(Matriz[i][j]);

            }

            System.out.println();

        }

        System.out.println("Ingresa la posicion que deseas SUMAR [CANTIDAD 1]");

        System.out.println("Ingresa fila: ");
        suma1 = leer.nextInt();

        System.out.println("Ingresa Columna: ");
        suma2 = leer.nextInt();

        System.out.println("Ingresa la posicion que deseas SUMAR [CANTIDAD 2]");

        System.out.println("Ingresa fila: ");
        suma3 = leer.nextInt();

        System.out.println("Ingresa Columna: ");
        suma4 = leer.nextInt();

        resultado = Matriz[suma1][suma2] + Matriz[suma3][suma4];
        System.out.println("RESULTADO: " + resultado);

    }

}
