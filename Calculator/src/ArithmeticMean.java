import java.util.InputMismatchException;
import java.util.Scanner;


public class ArithmeticMean {
    public static void main(String args[]) throws java.io.IOException {
        double a =0;
        double b=0;
        Scanner scanner = new Scanner(System.in);
        // блок выбора чисел
        System.out.println("First number:");
        while(true){
            try{
                a = scanner.nextDouble();
                break;
            }
            catch(InputMismatchException exc){
                scanner.nextLine();
                System.out.println(" Try again:");
            }
        }
        System.out.println("Second number:");
        while(true){
            try{
                b=scanner.nextDouble();
                break;
            }
            catch(InputMismatchException exc) {
                System.out.println(scanner.nextLine()+" Try again");
            }
        }
        System.out.println("Arithmetic mean of numbers:" + ((a+b)/2));
    }
}