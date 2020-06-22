import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();

        int one = n % 10;
        int two = n % 100 / 10;
        int three = n / 100;

        int reverse = 100 * one + 10 * two + three;
        System.out.println(reverse);
    }
}