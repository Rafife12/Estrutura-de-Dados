import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float n1 = scanner.nextFloat();

        if (n1 > 0) {
            double cubo = Math.pow(n1, 3);
            double raizQuadrada = Math.sqrt(n1);

            System.out.printf("O número digitado ao cubo: %.2f%n", cubo);
            System.out.printf("A raiz quadrada do número digitado: %.2f%n", raizQuadrada);
        } else {
            System.out.println("O número digitado não é positivo.");
        }
        scanner.close();
    }
}