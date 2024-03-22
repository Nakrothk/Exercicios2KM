import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite os 5 elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }

        int indiceMaiorElemento = encontrarIndiceMaiorElemento(vetor);

        if (indiceMaiorElemento != 4) {
            int temp = vetor[indiceMaiorElemento];
            vetor[indiceMaiorElemento] = vetor[4];
            vetor[4] = temp;
        }

        System.out.println("Vetor atualizado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int encontrarIndiceMaiorElemento(int[] vetor) {
        int indiceMaiorElemento = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > vetor[indiceMaiorElemento]) {
                indiceMaiorElemento = i;
            }
        }
        return indiceMaiorElemento;
    }
}
