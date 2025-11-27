import java.util.Scanner;

public class App {
    public static Scanner leitor;

    public static void main(String[] args) throws Exception {
        leitor = new Scanner(System.in);

        // Operadores lógicos: &&, || e !
        // Operadores relacionais: >, <, >=, <=, ==, !=
        // Operador de atribuição: =, ++, +=, --, -=
        // Operadores aritméticos: +, -, /, *, % (mod)

        int opcao;
        boolean teste = true;
        while (teste) {
            System.out.println("\n Escolha uma das opções: \n "
                    + "1 - imprime100 \n"
                    + "2 - imprimeN \n"
                    + "3 - nomes5 \n"
                    + "4 - adicao \n"
                    + "5 - pessoas \n"
                    + "6 - imparesN \n"
                    + "7 - tabuada \n"
                    + "8 - elevado \n"
                    + "9 - soma1N \n"
                    + "10 - fibonacciFor \n"
                    + "11 - fibonacciWhile \n"
                    + "12 - criarArray \n"
                    + "13 - unirArrays \n"
                    + "14 - palindromo \n"
                    + "15 - primo \n"
                    + "16 - perfeito \n"
                    + "0 - Sair");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    // imprime100: Faça uma função, utilizando while, que mostre na tela os números
                    // de 0 a 100;
                    imprime100();
                    break;
                case 2:
                    // imprimeN: Faça uma função, utilizando while, que mostre na tela de 0 até N,
                    // em que N é o limite inserido pelo usuário;
                    imprimeN();
                    break;
                case 3:
                    // nomes5: Faça uma função, utilizando while e array, que permita o usuário
                    // escrever o nome de cinco pessoas e os mostre na tela lendo do array;
                    nomes5();
                    break;
                case 4:
                    // adicao: Faça uma função, utilizando while, que permita o usuário fazer contas
                    // de adição enquanto quiser;
                    adicao();
                    break;
                case 5:
                    // pessoas: Faça uma função, utilizando while e arrays, que permita ao usuário
                    // realizar o cadastro de um número, determinado pelo mesmo, de nome pessoas e
                    // os mostre na tela ao finalizar, lendo do array;
                    pessoas();
                    break;
                case 6:
                    // imparesN: Faça uma função utilizando for que imprima os "n" primeiros números
                    // ímpares;
                    imparesN();
                    break;
                case 7:
                    // tabuada: Faça uma função utilizando for que imprima a tabuada de 1 a 10, de
                    // forma organizada e clara;
                    tabuada();
                    break;
                case 8:
                    // elevado: Faça uma função em for que calcule x^y (xis elevado a ipsilon);
                    elevado();
                    break;
                case 9:
                    // soma1N: Faça uma função utilizando for que leia um número n, some todos os
                    // números inteiros de 1 a n e mostre o resultado obtido;
                    soma1N();
                    break;
                case 10:
                    // fibonacciFor: Requisite um número inteiro n; crie um array de inteiros de
                    // tamanho n; popule este array com os n primeiros números da sequência
                    // fibonacci; imprima o array.
                    fibonacciFor();
                    break;
                case 11:
                    // fibonacciWhile: Imprima o próximo número da sequência de fibonacci sempre que
                    // for pressionada a tecla "enter"; caso seja pressionado "q"+"enter" termine o
                    // programa;
                    fibonacciWhile();
                    break;
                case 12:
                    // criarArray: Peça um tamanho de array; crie um array deste tamanho; peça cada
                    // uma das entradas e popule o array na devida posição; ao fim percorra o array
                    // e imprima a sequência digitada;
                    criarArray();
                    break;
                case 13:
                    //// unirArrays: Crie 2 arrays de inteiros, um de tamanho 7 e outro de tamanho
                    //// 11;
                    // para popular os arrays faça a leitura de cada um em uma "única linha"; crie
                    // um array de tamanho 18 e o popule com a união dos dois arrays anteriores,
                    // imprimindo o resultado;
                    unirArrays();   
                    break;
                case 14:
                    // palindromo: Escreva um código que receba uma entrada em texto (String) e diga
                    // se a String é ou não um Palíndromo utilizando estruturas de repetição;
                    palindromo();
                    break;
                case 15:
                    // primo: Escreva um código que recebe um número e imprime uma mensagem dizendo
                    // se ele é ou não é um número primo.
                    primo();
                    break;
                case 16:
                    // perfeito: Dado um número n inteiro e positivo, dizemos que n é perfeito se n
                    // for igual à soma de seus divisores positivos diferentes de n. Construa uma
                    // função que verifica se um dado número é perfeito. Exemplo: 6 é perfeito, pois
                    // 1+2+3=6.
                    perfeito();
                    break;
                default:
                    teste = false;
                    break;

            }

        }
        leitor.close();
    }

    public static void imprime100() {
        int num = 0;
        while (num <= 100) {
            System.out.println(num + " ");
            num++;

        }
    }

    public static void imprimeN() {
        System.out.print("Limite escolhido: ");
        int limite = leitor.nextInt();
        int num = 0;
        while (num <= limite) {
            System.out.print(num + " ");
            num++;
        }

    }

    public static void nomes5() {
        String[] pessoas = new String[5];
        leitor.nextLine();
        int i = 0;
        while (i < 5) {
            System.out.println("Escreva o nome da " + (i + 1) + "ª pessoa: ");
            pessoas[i] = leitor.nextLine();
            i++;
        }
        System.out.println("Nome das 5 pessoas:");
        i = 0;
        while (i < 5) {
            System.out.println("\"" + pessoas[i] + "\"");
            i++;
        }
    }

    public static void adicao() {
        System.out.print("Quantas adições você quer fazer: ");
        int n = leitor.nextInt();
        int i = 0;
        while (i < n) {
            System.out.print("Escreva o primeiro número: ");
            double a = leitor.nextDouble();
            System.out.print("Escreva o segundo número: ");
            double b = leitor.nextDouble();
            System.out.println("A soma de " + a + " + " + b + " é = " + (a + b));
            i++;
        }
    }

    public static void pessoas() {
        System.out.println("Quantas pessoas você quer cadastrar: ");
        int n = leitor.nextInt();
        leitor.nextLine();
        String[] pessoas = new String[n];
        int i = 0;
        while (i < n) {
            System.out.println("Escreva o nome da " + (i + 1) + "ª pessoa: ");
            pessoas[i] = leitor.nextLine();
            i++;
        }
        System.out.println("Nome das " + n + " pessoas:");
        i = 0;
        while (i < n) {
            System.out.println("\"" + pessoas[i] + "\"");
            i++;
        }
    }

    public static void imparesN() {
        System.out.println("Quantidade de números ímpares: ");
        int n = leitor.nextInt();
        int num = 1;
        for (int i = 0; i < n;) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                i++;
            }
            num++;
        }
    }

    public static void tabuada() {
        int i = 1;
        int j = 1;
        for (; i <= 10; i++) {
            System.out.println("A tabuada de " + i + " é: ");
            j = 1;
            for (; j <= 10; j++) {
                System.out.println(i + "*" + j + " é " + (i * j));
            }
        }
    }
    
    public static void elevado() {
        System.out.print("Base (x): ");
        int x = leitor.nextInt();
        System.out.print("Expoente (y): ");
        int y = leitor.nextInt();
        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        System.out.println(x + " elevado a " + y + " é " + resultado);
    }

    public static void soma1N() {
        System.out.print("Soma de 1 até: ");
        int n = leitor.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }
        System.out.println("A soma dos números de 1 a " + n + " é " + soma);
    }
    
    public static void fibonacciFor() {
        System.out.print("Quantos números da sequência de Fibonacci você quer: ");
        int n = leitor.nextInt();
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static void fibonacciWhile() {
        System.out.println("Pressione 'enter' para ver o próximo número da sequência de Fibonacci ou 'q' para sair.");
        int a = 1;
        int b = 1;
        while (true) {
            String input = leitor.nextLine();
            if (input.equals("q")) {
                break;
            }
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }

    public static void criarArray() {
        System.out.print("Tamanho do array: ");
        int n = leitor.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + ": ");
            array[i] = leitor.nextInt();
        }
        System.out.println("Sequência digitada:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void unirArrays() {
        int[] array1 = new int[7];
        int[] array2 = new int[11];
        System.out.println("Digite 7 números para o primeiro array (separados por espaço): ");
        for (int i = 0; i < 7; i++) {
            array1[i] = leitor.nextInt();
        }
        System.out.println("Digite 11 números para o segundo array (separados por espaço): ");
        for (int i = 0; i < 11; i++) {
            array2[i] = leitor.nextInt();
        }
        int[] unido = new int[18];
        for (int i = 0; i < 7; i++) {
            unido[i] = array1[i];
        }
        for (int i = 0; i < 11; i++) {
            unido[i + 7] = array2[i];
        }
        System.out.println("Array unido:");
        for (int i = 0; i < 18; i++) {
            System.out.print(unido[i] + " ");
        }
    }
    
    public static void palindromo() {
        System.out.print("Digite uma palavra ou frase: ");
        leitor.nextLine();
        String texto = leitor.nextLine().replaceAll("\\s+", "").toLowerCase();
        String reverso = new StringBuilder(texto).reverse().toString();
        if (texto.equals(reverso)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }

    public static void primo() {
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        boolean isPrimo = true;
        if (num <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }
        if (isPrimo) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }

    public static void perfeito() {
        System.out.print("Digite um número: ");
        int n = leitor.nextInt();
        int somaDivisores = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == n) {
            System.out.println(n + " é um número perfeito.");
        } else {
            System.out.println(n + " não é um número perfeito.");
        }
    }
}