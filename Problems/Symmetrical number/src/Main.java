import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int first = a / 1000;
        int second = (a / 100) % 10;
        int third = (a / 10) % 10;
        int fourth = a % 10;

        if (first == fourth && second == third) {
            System.out.println("1");
        } else {
            System.out.println("37");
        }

    }
}