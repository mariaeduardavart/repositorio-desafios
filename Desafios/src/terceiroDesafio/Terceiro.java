package terceiroDesafio;

import java.util.Scanner;

public class Terceiro {
	public static int contarPares(int k, int[] arr) {
        int count = 0;

        // Percorre o array para encontrar os pares
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Verifica se a diferença entre os elementos é igual ao valor alvo
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        return count;
    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int numPares = contarPares(k, arr);
        System.out.println(numPares);

        scanner.close();
    }
}


