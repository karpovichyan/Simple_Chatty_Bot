import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner reader = new Scanner(System.in);

        String str1 = reader.nextLine();
        String str2 = reader.nextLine();

        String newStr1 = str1.replaceAll(" ", "");
        String newStr2 = str2.replaceAll(" ", "");

        boolean isTrue = newStr1.equals(newStr2);

        System.out.println(isTrue);

    }
}