import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dentroIntervalo = 0, foraIntervalo = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num >= 10 && num <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println("Quantidade de números dentro do intervalo [10,20]: " + dentroIntervalo);
        System.out.println("Quantidade de números fora do intervalo [10,20]: " + foraIntervalo);
        scanner.close();
    }
}