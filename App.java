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

        // exercício da aula 8

        int atv;
        System.out.print("Digite o número do exercício (1-3): ");
        atv = leitor.nextInt();
        switch (atv) {
            case 1:
                String senha = "123";
                String entrada;
                int tentativas = 0;

                boolean continua = true;

                while (continua && tentativas < 3) {
                    entrada = leitor.next();
                    if (entrada.equals(senha)) {

                        System.out.println("Senha correta!");
                        continua = false;
                    } else {
                        System.out.println("Senha incorreta!");
                    }

                    tentativas = tentativas + 1;
                }
                break;
            case 2:
                int numero;
                int multiplos;
                System.out.print("Digite um número e a quantidade de múltiplos: ");
                numero = leitor.nextInt();
                multiplos = leitor.nextInt();
                for (int i = 1; i <= multiplos; i++) {
                    System.out.println(numero * i);
                }
                break;
            case 3:
                int num;
                do {
                    System.out.print("Digite um número inteiro (negativo para sair): ");
                    num = leitor.nextInt();
                    if (num >= 0) {
                        if (num % 2 == 0) {
                            System.out.println(num + " é par.");
                            if (num % 3 == 0) {
                                System.out.println(num + " é múltiplo de 3.");
                            }
                            if (num % 5 == 0) {
                                System.out.println(num + " é múltiplo de 5.");
                            }
                            if (num % 7 == 0) {
                                System.out.println(num + " é múltiplo de 7.");
                            }
                        } else {
                            System.out.println(num + " é ímpar.");
                        }
                    }
                } while (num >= 0);
                break;
        
            default:
                break;
        }
        
        
        leitor.close();

    }
}