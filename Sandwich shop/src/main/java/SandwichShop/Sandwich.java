package SandwichShop;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What size do you want (Regular or Large)\n");

        String size = scanner.next();
        float regular = 5.45f;
        float large = 8.85f;
        float basePrice = 0.0f;
        if (size.equalsIgnoreCase("Regular")) {
            basePrice = regular;
        }
            else if (size.equalsIgnoreCase("Large")) {
                basePrice = large;
            }

            else {
            System.out.print("Not Applicable");
            return;
        }
            System.out.print("Would you like the sandwich loaded? (yes/no)");
            String answer = scanner.next();

            if (answer.equals("yes")) {
                if (basePrice == regular){
                    basePrice = basePrice + 1.0f;
                }
                if (basePrice == large) {
                    basePrice = basePrice + 1.75f;
                }
            }

            else
                return;


            System.out.print("What is your age?\n");
            int age = scanner.nextInt();

            float officialPrice;
            if (age <= 17) {
                officialPrice = basePrice - (basePrice * .10f);
            }
            else if (age >= 65){
                officialPrice = basePrice - (basePrice * .20f);
            }
            else {
                officialPrice = basePrice;
            }

            System.out.printf("Your total is $%.2f",officialPrice);

    }
}




