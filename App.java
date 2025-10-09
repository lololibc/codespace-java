import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        // Operadores lógicos: &&, || e !
        // Operadores relacionais: >, <, >=, <=, ==, !=
        // Operador de atribuição: =, ++, +=, --, -=
        // Operadores aritméticos: +, -, /, *, % (mod)

        /*
         * int i = 0;
         * do {
         * i++;
         * }while (i<7);
         * System.out.println("i = " + i);
         * 
         * int num = 0;
         * while (num < 7) {
         * num++;
         * }
         * System.out.println("num = " + num);
         */

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
                    int num1 = leitor.nextInt();
                    System.out.print("Entre com o segundo número: ");
                    int num2 = leitor.nextInt();
                    int soma = num1 + num2;
                    System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma);
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2: Subtração");
                    break;
                case 3:
                    System.out.println("Você escolheu a opção 3: Multiplicação");
                    break;
                case 4:
                    System.out.println("Você escolheu a opção 4: Divisão");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
        } while (opcao != 5);

        leitor.close();

    }
}