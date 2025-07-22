import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        int n = recebeInteiro();
        for (int aux = 1; aux <= 10; aux++) {
            System.out.println(n + " x " + aux + " = " + (n * aux));
        }
        System.out.println("\nFim");
    }

    private static int recebeInteiro() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (n <= 0) {
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Número inválido");
            }
        }

        scanner.close();
        return n;
    }
}