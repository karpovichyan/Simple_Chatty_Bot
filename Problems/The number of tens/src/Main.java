import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        long n = scanner.nextLong();
        System.out.println((n % 100) / 10);
    }
}