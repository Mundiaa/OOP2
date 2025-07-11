package Challenge_5;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter numbers to check if they are positive, negative");
        System.out.println("Type 0 to exit.");
        while (true){
            System.out.print("Enter a number:");
            number = input.nextInt();

            if (number == 0) {
                System.out.println("Exiting program.");
                break;
            }
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("exit program.");
            }

        }

    }
}
