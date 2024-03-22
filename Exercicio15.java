import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");

        vetor[0] = scanner.nextInt();
        for (int i = 1; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("O número digitado deve ser maior que o anterior. Tente novamente.");
                i--;
            }
        }

        System.out.println("Vetor preenchido de acordo com a regra:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
