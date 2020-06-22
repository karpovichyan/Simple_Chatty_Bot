import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner reader = new Scanner(System.in);

        String letters = reader.next();
        System.out.println(letters.replace("a", "b"));
    }
}