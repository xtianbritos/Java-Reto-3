import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int numero;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        numero = input.nextInt();

        for(int i=1; i<11; i++) {
            System.out.println(numero+" x "+i+" = "+numero*i);
        }
    }
}
