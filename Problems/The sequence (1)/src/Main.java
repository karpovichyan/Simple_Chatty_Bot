import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int temp = 0;
        boolean end = false;

        for (int i = 0; i < n; i++) {
            count++;
            if (end) {
                break;
            }
            for (int j = 0; j < n; j++) {
                temp++;
                System.out.print(count + " ");
                if (temp == n) {
                    end = true;
                    break;
                }
                if (i == j) {
                    break;
                }
            }
        }
    }
}