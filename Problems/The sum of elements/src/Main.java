import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);

        int number;
        int sum = 0;
        do {
            number = reader.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println(sum);
    }
}