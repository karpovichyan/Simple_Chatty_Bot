import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        boolean bool = true;
        int value;

        do {
            value = sc.nextInt();
            sum += value;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                bool = false;
                break;
            }
        } while (value != 0);

        if (bool) {
            System.out.println(sum);
        }
    }
}
