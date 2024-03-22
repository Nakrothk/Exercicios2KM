import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        double media = calcularMedia(vetor);

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

        scanner.close();
    }

    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        return (double) soma / vetor.length;
    }
}
