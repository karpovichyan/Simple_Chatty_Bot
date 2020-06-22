import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = sc.nextInt();

        int countOfA = 0;
        int countOfB = 0;
        int countOfC = 0;
        int countOfD = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int grades = sc.nextInt();
            if (grades == 5) {
                countOfA++;
            } else if (grades == 4) {
                countOfB++;
            } else if (grades == 3) {
                countOfC++;
            } else if (grades == 2) {
                countOfD++;
            }
        }
        System.out.println(countOfD + " " + countOfC + " " + countOfB + " " + countOfA);
    }
}