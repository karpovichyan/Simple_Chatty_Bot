import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int durations = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int oneNightInAHotel = scanner.nextInt();

        System.out.println(durations * foodCost + flightCost * 2 + oneNightInAHotel * (durations - 1));
    }
}