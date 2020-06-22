import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int max = 0;

        while (true) {
            int sequenceNumber = sc.nextInt();
            if (sequenceNumber > max) {
                max = sequenceNumber;
            } else if (sequenceNumber == 0) {
                break;
            }
        }
        System.out.println(max);
    }
}