import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean isPositiveH1 = h1 > 0 && h2 <= 0 && h3 <= 0;
        boolean isPositiveH2 = h2 > 0 && h1 <= 0 && h3 <= 0;
        boolean isPositiveH3 = h3 > 0 && h1 <= 0 && h2 <= 0;

        System.out.println(isPositiveH1 ^ isPositiveH2 ^ isPositiveH3);

    }
}