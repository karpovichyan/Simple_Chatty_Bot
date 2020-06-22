import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int sequence= sc.nextInt();;
        int count = 0;
        while (sequence != 0) {
            sequence = sc.nextInt();
            count++;
        }
        System.out.println(count);
    }
}