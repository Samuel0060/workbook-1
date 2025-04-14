package basic_calculator;

import java.util.Scanner;

public class payroll_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?\n");
        String name = scanner.next();

        System.out.print("Hours worked?\n");
        int hours = scanner.nextInt();

        System.out.print("Pay rate?\n");
        float rate = scanner.nextFloat();

        float grosspay = hours * rate;

        System.out.printf("%s\nGross Pay: $%.2f",name,grosspay);
    }
}
