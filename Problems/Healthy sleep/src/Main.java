import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();
        int h = reader.nextInt();

        if (h >= a && h <= b) {
            System.out.println("Normal");
        } else if (h < a) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}