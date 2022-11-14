import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numero;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Ingresa un número entero:");
            numero = input.nextInt();
        }
        while (numero <= 500);
    }
}
