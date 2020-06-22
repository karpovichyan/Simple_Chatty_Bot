import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int resultSeconds1 = 3600 * hours1 + 60 * minutes1 + seconds1;
        int resultSeconds2 = 3600 * hours2 + 60 * minutes2 + seconds2;

        System.out.println(resultSeconds2 - resultSeconds1);

    }
}