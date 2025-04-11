package com.pluralsight;

public class mathapp {
    public static void main(String[] args) {
        //Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine whose salary is greater using Math.max() and
        //store the answer in highestSalary. Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is ...")

        long bobSalary = 20_000;
        long garySalary = 40_000;
        long highestSalary = Math.max(bobSalary, garySalary);

        system.out.println("The answer is " + highestSalary);
    }
}
