import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            B[i] = A[4 - i];
        }

        System.out.print("Vetor B após a cópia invertida de A: ");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
