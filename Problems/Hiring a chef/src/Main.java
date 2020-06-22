//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);

        String firstName = reader.next();
        reader.next();
        reader.next();
        reader.next();
        String cuisinePreference = reader.next();

        System.out.println("The form for " + firstName + " is completed. " +
                            "We will contact you if we need a chef that cooks " +
                            cuisinePreference + " dishes.");
    }
}