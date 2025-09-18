import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Operadores lógicos: &&, || e !
        // Operadores relacionais: >, <, >=, <=, ==, !=
        // Operador de atribuição: =, ++, +=, --, -=
        // Operadores aritméticos: +, -, /, *, % (mod)

        /* int a = 1;
        int b = 2;

        int resultado = a % 2;
        
        System.out.println(resultado); */
        

        /* Aninhamento de ifs

        if(a == 1){
        
            System.out.println("a = 1");
            if (b == 2) {
                System.out.println("b = 2");
            }
        }else{
        
            System.out.println("Entrou no else");
        } */
       

        // Encadeamento de ifs

         System.out.print("Entre com um número: ");
        int num = teclado.nextInt();

        
        if (num == 1) { //breakpoint (bolinha vermelha)
            System.out.println("um");
        }else if (num == 2) {
            System.out.println("dois");
        }else if (num == 3) {
            System.out.println("três");
        }else if (num == 4) {
            System.out.println("quatro");
        } else {
            System.out.println("número desconhecido");
        }

        /* switch (num) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            case 4:
                System.out.println("quatro");
                break;
            default:
                System.out.println("número desconhecido");
        } */

        /* switch (num) {
            case 1 -> System.out.println("um"); 
            case 2 -> System.out.println("dois");
            case 3 -> System.out.println("três");
            case 4 -> System.out.println("quatro");
            default -> System.out.println("desconhecido");
        } */
        
        /* String res = switch(num){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            default -> "desconhecido";
        }; */





        teclado.close();


    }
}