import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Selecione o exercício (1, 2, 3 ou 4): ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                // Dado um vetor com 10 números reais, faça um algoritmo que percorra o vetor e
                // imprima o seu maior elemento.

                double n2[] = { 3.7, 4.8, 5.3, 9.9, 4.3, 5.6, 1.3, 4.5, 10, 7 };

                double maior = n2[0];
                for (int i = 1; i < n2.length; i++) {
                    if (n2[i] > maior) {
                        maior = n2[i];
                    }
                }
                System.out.println("A maior nota é: " + maior); 

            break;
            case 2:
                // Utilizando vetor, imprimir os n primeiros termos da série de Fibonacci: 1 1 2
                // 3 5 8 ... n

                int n = leitor.nextInt();
                int[] fibo = new int[n];

                fibo[0] = 1;
                fibo[1] = 1;
                System.out.println(fibo[0]);
                System.out.println(fibo[1]);

                for (int i = 2; i < n; i++) {
                    fibo[i] = fibo[i - 1] + fibo[i - 2];
                    System.out.println(fibo[i]);
                }
            break;
            case 3:
                 //Defina dois vetores com 5 elementos cada. Faça um algoritmo que
                 //calcule e imprima a soma deles. Ou seja, a soma de cada elemento de um vetor
                 //pelo elemento correspondente do outro vetor.
                 
                double A[] = { 1, 2, 3, 4, 5 };
                double B[] = { 6, 7, 8, 9, 10 };
                System.out.print("Digite o índice do elemento que deseja somar (0 a 4): ");
                int num = leitor.nextInt();

                double soma = A[num] + B[num];
                System.out.println(soma);
                break;
            case 4:
                // Leia a nota de 38 alunos de uma turma e calcule a média das notas, a maior e a menor nota.
                double notas[] = new double[38];
                double somaNotas = 0;
                double notaMaior = 0;
                double notaMenor = 0;
                for (int i = 0; i < notas.length; i++) {
                    System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                    notas[i] = leitor.nextDouble();
                    somaNotas = somaNotas + notas[i];
                    if (i == 0) {
                        notaMaior = notas[i];
                        notaMenor = notas[i];
                    } else {
                        if (notas[i] > notaMaior) {
                            notaMaior = notas[i];
                        }
                        if (notas[i] < notaMenor) {
                            notaMenor = notas[i];
                        }
                    }
                }
                somaNotas = somaNotas / notas.length;
                System.out.println("Média das notas: " + somaNotas);
                System.out.println("Maior nota: " + notaMaior);
                System.out.println("Menor nota: " + notaMenor);
            break;
            default:
                System.out.println("Opção inválida");
            break;
        }

        leitor.close();
    }
}
