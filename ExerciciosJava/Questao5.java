import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a operação desejada:");
        System.out.println("Adição (+)");
        System.out.println("Subtração (-)");
        System.out.println("Multiplicação (*)");
        System.out.println("Divisão (/)");
        System.out.print("Digite o operador da operação: ");
        char operacao = scanner.next().charAt(0);

        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        float resultado;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.printf("O resultado da adição é: %.2f%n", resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.printf("O resultado da subtração é: %.2f%n", resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.printf("O resultado da multiplicação é: %.2f%n", resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("O resultado da divisão é: %.2f%n", resultado);
                } else {
                    System.out.println("Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }
        scanner.close();
    }
}