import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        // Operadores lógicos: &&, || e !
        // Operadores relacionais: >, <, >=, <=, ==, !=
        // Operador de atribuição: =, ++, +=, --, -=
        // Operadores aritméticos: +, -, /, *, % (mod)

        int opcao;
        double altura;
        double largura;
        double cateto1;
        double cateto2;
        double hipotenusa;
        double area;
        double raio;

        double num1;
        double num2;
        double num3;
        double media;

        System.out.print(
                "Escolha uma das opções a seguir: \n (1) Calcular a àrea de um retângulo\n (2) Calcular a área de um triângulo\n (3) Calcular a hipotenusa de um triângulo retângulo\n (4) Calcular a área de um círculo\n (5) Calcular o perímetro de um Círculo\n (6) Calcular a média de 3 notas\n Opcão escolhida: ");
        opcao = leitor.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Vamos calcular a área de um retângulo!");

                System.out.print("Entre com a altura do retângulo: ");
                altura = leitor.nextDouble();
                if (altura <= 0) {
                    System.out.println("Opção inválida!");
                } else {
                    System.out.print("Entre com a largura do retângulo: ");
                    largura = leitor.nextDouble();
                    if (largura <= 0) {
                        System.out.println("Opção inválida!");
                    } else {
                        area = altura * largura;
                        System.out.println("A área do retângulo é: " + area);
                    }
                }
                break;
            case 2:
                System.out.println("Vamos calcular a área de um triângulo!");

                System.out.print("Entre com a altura do triângulo: ");
                altura = leitor.nextDouble();
                if (altura <= 0) {
                    System.out.println("Opção inválida!");
                } else {
                    System.out.print("Entre com a largura do triângulo: ");
                    largura = leitor.nextDouble();
                    if (largura <= 0) {
                        System.out.println("Opção inválida!");
                    } else {
                        area = (altura * largura) / 2;
                        System.out.println("A área do triângulo é: " + area);
                    }
                }
            case 3:
                System.out.println("Vamos calcular a hipotenusa de um triângulo retângulo!");

                System.out.print("Entre com um cateto do triângulo: ");
                cateto1 = leitor.nextDouble();
                if (cateto1 <= 0) {
                    System.out.println("Opção inválida!");
                } else {
                    System.out.print("Entre com o outro cateto do triângulo: ");
                    cateto2 = leitor.nextDouble();
                    if (cateto2 <= 0) {
                        System.out.println("Opção inválida!");
                    } else {
                        hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
                        System.out.println("A hipotenusa do triângulo é: " + hipotenusa);
                    }
                }
                break;
            case 4:
                System.out.println("Vamos calcular a área de um círculo!");

                System.out.print("Entre com o raio do círculo: ");
                raio = leitor.nextDouble();
                if( raio <= 0) {
                    System.out.println("Opção inválida!");
                } else {
                    area = Math.PI * Math.PI * raio;
                    System.out.println("A área do círculo é: " + area);
                }
                break;
            case 5:
                System.out.println("Vamos calcular o perímetro de um círculo!");

                System.out.print("Entre com o raio do círculo: ");
                raio = leitor.nextDouble();
                if( raio <= 0) {
                    System.out.println("Opção inválida!");
                } else {
                    area = 2 * Math.PI * raio;
                    System.out.println("O perímetro do círculo é: " + area);
                }
                break;
            case 6:
                System.out.println("Vamos calcular a média de 3 notas!");
                System.out.print("Entre com a primeira nota: ");
                num1 = leitor.nextDouble();
                System.out.print("Entre com a segunda nota: ");
                num2 = leitor.nextDouble();
                System.out.print("Entre com a terceira nota: ");
                num3 = leitor.nextDouble();
                media = (num1 + num2 + num3) / 3;
                System.out.println(" A média é igual a: " + media);
                break;
            default:
                System.out.println("Opção inválida!");

        }

        leitor.close();
    }
}codigo