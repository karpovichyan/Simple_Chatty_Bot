import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str.charAt(0) == 'J' || str.charAt(0) == 'j');
    }
}
