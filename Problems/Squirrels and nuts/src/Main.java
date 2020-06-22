import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        long squirrels = scanner.nextLong();
        long nuts = scanner.nextLong();

        System.out.println(nuts % squirrels);
    }
}