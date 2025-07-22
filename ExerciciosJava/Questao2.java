import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 12 e 20: ");
            numero = scanner.nextInt();
            if (numero < 12 || numero > 20) {
                System.out.println("Entrada inválida.");
            }
        } while (numero < 12 || numero > 20);

        System.out.println("O número " + numero + " é válido.");
        scanner.close();
    }
}