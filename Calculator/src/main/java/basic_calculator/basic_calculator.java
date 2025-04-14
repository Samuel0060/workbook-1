package basic_calculator;

import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option: ");
        String answer = scanner.next();

        int result = 0;
        if (answer.equals("a")) {
            result = firstNumber + secondNumber;
        } else if (answer.equals("s")) {
            result = firstNumber - secondNumber;
        } else if (answer.equals("m")) {
            result = firstNumber * secondNumber;
        } else if (answer.equals("d")) {
            result = firstNumber / secondNumber;
        } else {
            System.out.print("Not applicable");
        }

        System.out.printf("%d * %d = %d",firstNumber,secondNumber,result);

    }
}
