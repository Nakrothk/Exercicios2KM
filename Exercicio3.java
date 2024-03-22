import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetorOriginal = new int[tamanho];

        System.out.println("Digite os números separados por espaço:");
        for (int i = 0; i < tamanho; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        int[] vetorDobro = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        System.out.println("Valores do vetor com o dobro dos números do vetor original:");
        for (int num : vetorDobro) {
            System.out.println(num);
        }

        scanner.close();
    }
}
