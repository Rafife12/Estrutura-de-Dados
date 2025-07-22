import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma = " + soma);
        scanner.close();
    }
}