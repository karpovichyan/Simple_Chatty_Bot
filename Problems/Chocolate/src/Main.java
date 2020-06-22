import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        int m = reader.nextInt();
        int k = reader.nextInt();

        if ((k % n == 0 || k % m == 0) && k < n * m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}