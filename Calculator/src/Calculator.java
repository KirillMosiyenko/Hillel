import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input first number");
        double a = input.nextDouble();
        System.out.println("Your first input:" +a);
        System.out.println("Please input second number");
        double b = input.nextDouble();
        System.out.println("Your results:");
        System.out.println("Sum is "+(a+b));
        System.out.println("Difference is "+(a-b));
        System.out.println("Multiplication is "+(a*b));
        if (b!=0){
            System.out.println("Devision is " + (a / b));
        }
    }
}