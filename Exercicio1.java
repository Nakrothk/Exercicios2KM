import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o vetor de tamanho 5
        int[] vetor = new int[5];

        // Lendo os valores do usuário e armazenando no vetor
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Calculando a média
        double media = calcularMedia(vetor);

        // Exibindo os valores menores, iguais e superiores à média
        System.out.println("\nValores menores que a média:");
        for (int num : vetor) {
            if (num < media) {
                System.out.println(num);
            }
        }

        System.out.println("\nValores iguais à média:");
        for (int num : vetor) {
            if (num == media) {
                System.out.println(num);
            }
        }

        System.out.println("\nValores superiores à média:");
        for (int num : vetor) {
            if (num > media) {
                System.out.println(num);
            }
        }
    }

    // Método para calcular a média dos valores no vetor
    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        return (double) soma / vetor.length;
    }
}

