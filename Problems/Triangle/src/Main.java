import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}