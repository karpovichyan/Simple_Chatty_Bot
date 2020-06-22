import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(str.substring(first, second + 1));
    }
}
