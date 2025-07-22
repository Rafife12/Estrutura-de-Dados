import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contPar = 0, contImpar = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        System.out.println("Foram digitados " + contPar + " números pares");
        System.out.println("E " + contImpar + " números ímpares");
        scanner.close();
    }
}