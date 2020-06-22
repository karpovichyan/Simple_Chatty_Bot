import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();

        if (-15 < a && a <= 12 || a > 14 && a < 17 || a >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}