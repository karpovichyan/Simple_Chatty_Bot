import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();


        if ((Math.abs(x1 - x2) == Math.abs(y1 - y2)) || (x1 == x2) && (y1 == y2) || (x1 == y1) || (x2 == y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}