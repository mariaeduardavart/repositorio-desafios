package quartoDesafio;

import java.util.Scanner;

public class Quarto {
    public static String desembaralharString(String str) {
        int len = str.length();
        int mid = len / 2;
        StringBuilder sb = new StringBuilder();

        for (int i = mid - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        for (int i = len - 1; i >= mid; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximoInt()

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String originalLine = desembaralharString(line);
            System.out.println(originalLine);
        }

        scanner.close();
    }
}
