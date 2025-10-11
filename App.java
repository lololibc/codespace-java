import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        // Operadores lógicos: &&, || e !
        // Operadores relacionais: >, <, >=, <=, ==, !=
        // Operador de atribuição: =, ++, +=, --, -=
        // Operadores aritméticos: +, -, /, *, % (mod)
        // Estruturas condicionais: if, else if, else, switch
        // Estruturas de repetição: for, while, do while

        // exercício da aula 7
        int opcao;
        do {
            System.out.println(
                    "Opções do Menu:\n1 - Opção 1: Soma\n2 - Opção 2: Subtração\n3 - Opção 3: Multiplicação\n4 - Opção 4: Divisão\n5 - Opção 5: Sair");
            System.out.print("Digite um número entre 1 e 5: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1: Soma");
                    System.out.print("Entre com o primeiro número: ");
                    double num1 = leitor.nextInt();
                    System.out.print("Entre com o segundo número: ");
                    double num2 = leitor.nextInt();
                    double soma = num1 + num2;
                    System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma);
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2: Subtração");
                    System.out.println("Você escolheu a opção 2: Subtração");
                    System.out.print("Entre com o primeiro número: ");
                    num1 = leitor.nextInt();
                    System.out.print("Entre com o segundo número: ");
                    num2 = leitor.nextInt();
                    double subtracao = num1 - num2;
                    System.out.println("A diferença de " + num1 + " - " + num2 + " = " + subtracao);
                    break;
                case 3:
                    System.out.println("Você escolheu a opção 3: Multiplicação");
                    System.out.print("Entre com o primeiro número: ");
                    num1 = leitor.nextInt();
                    System.out.print("Entre com o segundo número: ");
                    num2 = leitor.nextInt();
                    double multiplicacao = num1 * num2;
                    System.out.println("O produto de " + num1 + " * " + num2 + " = " + multiplicacao);
                    break;
                case 4:
                    System.out.println("Você escolheu a opção 4: Divisão");
                    System.out.print("Entre com o primeiro número: ");
                    num1 = leitor.nextInt();
                    System.out.print("Entre com o segundo número: ");
                    num2 = leitor.nextInt();
                    if (num2 == 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case 5:
                    System.out.println("Você escolheu a opção 5: Sair");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 5);

        leitor.close();

    }
}