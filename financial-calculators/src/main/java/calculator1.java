import java.util.Scanner;

public class calculator1 {

    public static void main(String[] args) {
        float mortgageCalculator();   //calling my methods
        float futureValueCalculator();

        Scanner input  = new Scanner(System.in);
        System.out.println("M for Mortgage Calculator.\n F for Future Value Calculator");
        String choice = input.next();

        if (choice.equalsIgnoreCase("M")){
            mortgageCalculator();
        } else if (choice.equalsIgnoreCase(("F"))){
            futureValueCalculator();
        }else{
            System.out.print("Invalid Choice!");
        }


    }
    public static float mortgageCalculator() {
        Scanner principal = new Scanner(System.in);
        System.out.println("Principal: ");
        Float
    }
}
