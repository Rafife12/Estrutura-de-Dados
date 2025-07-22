import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        do {
            System.out.print("Digite um número: ");
            x = scanner.nextInt();
            if (x > 1) {
                System.out.println("Tente novamente");
            }
        } while (x > 1);

        scanner.close();
    }
}