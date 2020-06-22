import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean asc = true;
        int i;
        int j = 0;
        int count = 0;

        while (true) {
            if (count < 2) {
                i = s.nextInt();
                if (i == 0) {
                    break;
                }
                count++;
            } else {
                i = j;
                j = s.nextInt();

                if (i == j) {
                    continue;
                }

                if (j == 0) {
                    System.out.println(true);
                    break;
                }
                count++;
            }
            if (count < 2) {
                j = s.nextInt();

                if (i == j) {
                    continue;
                }

                if (j == 0) {
                    System.out.println(true);
                    break;
                }
                count++;
            }

            if (count == 2 && j < i) {
                asc = false;
            }

            if ((asc && j < i) || (!asc && j > i)) {
                System.out.println(false);
                break;
            }
        }
    }
}