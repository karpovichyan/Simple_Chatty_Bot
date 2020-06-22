import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (n >= i) {
            if (Math.sqrt(i) % 1 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}