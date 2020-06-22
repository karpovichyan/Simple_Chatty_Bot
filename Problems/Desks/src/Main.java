import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        double one = scanner.nextInt();
        double two = scanner.nextInt();
        double three = scanner.nextInt();

        double sumOfTables = Math.ceil(one / 2) + Math.ceil(two / 2) + Math.ceil(three / 2);
        System.out.println((int) sumOfTables);
    }
}