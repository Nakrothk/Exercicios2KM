import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[12];

        System.out.println("Digite os 12 elementos do vetor:");
        for (int i = 0; i < 12; i++) {
            vetor[i] = scanner.nextInt();
        }

        int produto = 1;
        for (int num : vetor) {
            if (num > 0 && num % 2 == 0) {
                produto *= num;
            }
        }

        System.out.println("O produto dos elementos pares positivos do vetor é: " + produto);

        scanner.close();
    }
}

