import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Aluno " + i + ", digite sua 1ª nota:");
            int nota1 = scanner.nextInt();

            System.out.println("Aluno " + i + ", digite sua 2ª nota:");
            int nota2 = scanner.nextInt();

            System.out.println("Aluno " + i + ", digite sua 3ª nota:");
            int nota3 = scanner.nextInt();

            int media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do aluno " + i + " é " + media);

            if (media >= 0 && media < 4) {
                System.out.println("Nota E");
            } else if (media < 5) {
                System.out.println("Nota D");
            } else if (media < 7) {
                System.out.println("Nota C");
            } else if (media < 8) {
                System.out.println("Nota B");
            } else if (media <= 10) {
                System.out.println("Nota A");
            }
        }
        scanner.close();
    }
}