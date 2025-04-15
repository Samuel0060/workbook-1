package basic_calculator;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pickup date? ");
        String date = scanner.next();

        System.out.print("Number of days for rental: ");
        int days = scanner.nextInt();

        System.out.print("Do you want an electronic tag at $3.95 per day? (y/n)");
        String answer = scanner.next();

        float initialCost = 29.99f * days;
        float tagCost = 0;
        if (answer.equals("y")) {
            tagCost = 3.95f * days;
        } else if (answer.equals("n")) {
            tagCost = 0;

        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.print("Do you want a GPS at $2.95 a day? (y/n) ");
        String answer2 = scanner.next();

        if (answer2.equals("y")) {
            tagCost = (2.95f * days) + tagCost;
        } else if (answer2.equals("n")) {
            tagCost = tagCost;

        } else
            return;

        System.out.print("Do you want roadside assistance at $3.95 a day? (y/n)");
        String answer3 = scanner.next();

        if (answer3.equals("y")) {
            tagCost = (3.95f * days) + tagCost;
        }else if (answer3.equals("n")) {
            tagCost = tagCost;

        } else
            return;

        System.out.print("What is your age?");
        int age = scanner.nextInt();
        float initialCost1;

        if (age < 25){
            initialCost1 =(initialCost + (initialCost * .30f));
        }
        else
            initialCost1 = 0;

        float totalCost = initialCost + initialCost1 + tagCost;

        System.out.printf("Your basic car rental is $%.2f.\n All your extra options come out to be $%.2f.\n Your underage surcharge is $%.2f.\n Your total cost is $%.2f ",initialCost,tagCost,initialCost1,totalCost);


    }


}
