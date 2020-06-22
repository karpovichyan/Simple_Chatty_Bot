import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();

        if (a > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}