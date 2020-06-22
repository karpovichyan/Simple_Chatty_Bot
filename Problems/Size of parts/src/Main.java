import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int numberOfParts = sc.nextInt();

        int perfect = 0;
        int large = 0;
        int small = 0;

        for (int i = 0; i < numberOfParts; i++) {
            int part = sc.nextInt();
            if (part == 0) {
                perfect++;
            } else if (part == 1) {
                large++;
            } else if (part == -1) {
                small++;
            }
        }
        System.out.println(perfect + " " + large + " " + small);
    }
}