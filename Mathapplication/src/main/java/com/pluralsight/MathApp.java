package com.pluralsight;

import static java.lang.Math.min;
import static java.lang.Math.negateExact;

public class MathApp {
    public static void main(String[] args) {
        //Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine whose salary is greater using Math.max() and
        //store the answer in highestSalary. Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is ...")

        long bobSalary = 20_000;
        long garySalary = 40_000;
        long highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The answer is " + highestSalary);


        long carPrice = 35_000;
        long truckPrice = 55_000;
        long compare = Math.min(carPrice, truckPrice);

        System.out.println("The smallest number is " + compare);



        float radius = 7.25F;
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Area of the circle: " + area);

        //find and display the square root of a variable after it is set to 5
        double x1 = 3, y1 = 4;
        double x2 = 7, y2 = 1;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between points: " + distance);

        double variable = -3.8;
        double positive = Math.abs(variable);
        System.out.println(positive);

        double random = Math.random();
        System.out.println(random);

    }
}
