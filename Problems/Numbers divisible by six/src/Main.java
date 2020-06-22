import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);

        int numberOfElements = reader.nextInt();
        int sum = 0;

        for (int i = 0; i < numberOfElements; i++) {
            int elemetsOfSequence = reader.nextInt();
            if (elemetsOfSequence % 6 == 0) {
                sum += elemetsOfSequence;
            }
        }
        System.out.println(sum);
    }
}