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
        // exercicio 1
        String senha = "123";
        String entrada;
        int tentativas = 0;

        boolean continua = true;
        
        while (continua && tentativas < 3){
            entrada = leitor.next();
            if (entrada.equals(senha)) {

                System.out.println("Senha correta!");
                continua = false;
            } else {
                System.out.println("Senha incorreta!");
            }

            tentativas = tentativas + 1;
        }
        
        leitor.close();

    }
}