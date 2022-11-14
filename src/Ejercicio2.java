import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int opcion;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese 0 para terminar");
        opcion = input.nextInt();

        while (opcion != 0) {
            System.out.println("Ingrese 0 para terminar");
            opcion = input.nextInt();
        }
    }
}
