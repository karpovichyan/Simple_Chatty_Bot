import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int butterCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        if (weekend) {
            if (butterCups >= 15 && butterCups <= 25) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            if (butterCups >= 10 && butterCups <= 20) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}