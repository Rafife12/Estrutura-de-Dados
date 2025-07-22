import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7: ");
        int numero = scanner.nextInt();
        scanner.close();

        String diaSemana;
        switch (numero) {
            case 1: diaSemana = "Domingo"; break;
            case 2: diaSemana = "Segunda-feira"; break;
            case 3: diaSemana = "Terça-feira"; break;
            case 4: diaSemana = "Quarta-feira"; break;
            case 5: diaSemana = "Quinta-feira"; break;
            case 6: diaSemana = "Sexta-feira"; break;
            case 7: diaSemana = "Sábado"; break;
            default: diaSemana = "Número inválido"; break;
        }

        System.out.println("Dia da semana correspondente: " + diaSemana);
    }
}