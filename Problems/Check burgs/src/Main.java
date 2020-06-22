import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner reader = new Scanner(System.in);

        String nameOfACity = reader.nextLine();

        boolean isTrue = nameOfACity.endsWith("burg");
        System.out.println(isTrue);

    }
}