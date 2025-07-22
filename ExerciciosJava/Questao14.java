import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, menorIdade = Integer.MAX_VALUE, maiorIdade = 0, mulheres = 0, menorSalarioIdade = 0;
        float menorSalario = Float.MAX_VALUE, somaSalarios = 0;
        char sexo;
        int totalPessoas = 0;

        System.out.println("Digite a idade, sexo (M/F) e salário. Digite uma idade negativa para finalizar.");

        while (true) {
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            if (idade < 0) break;

            System.out.print("Sexo (M/F): ");
            sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Salário: ");
            float salario = scanner.nextFloat();

            totalPessoas++;
            somaSalarios += salario;

            if (sexo == 'F') mulheres++;
            if (idade < menorIdade) menorIdade = idade;
            if (idade > maiorIdade) maiorIdade = idade;
            if (salario < menorSalario) {
                menorSalario = salario;
                menorSalarioIdade = idade;
            }
        }

        float mediaSalarios = somaSalarios / totalPessoas;

        System.out.printf("A) A média dos salários do grupo: %.2f%n", mediaSalarios);
        System.out.printf("B) A maior e a menor idade do grupo: %d e %d%n", maiorIdade, menorIdade);
        System.out.printf("C) A quantidade de mulheres na região: %d%n", mulheres);
        System.out.printf("D) A idade da pessoa que possui o menor salário: %d%n", menorSalarioIdade);

        scanner.close();
    }
}