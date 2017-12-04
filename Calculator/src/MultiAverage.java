import java.util.InputMismatchException;
import java.util.Scanner;



public class MultiAverage {

    public static void main(String args[])throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        double number =0;
        int qt = 0;
        System.out.println("После каждого числа нажимайте Enter, для выхода введите произвольный текст.");
        while(true) {
            try {
                number += scanner.nextDouble();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(" завершение");
                break;
            }
            qt++;
        }
        System.out.println("среднеарифметическое значение введенных данных равно: "+(number/qt));
        //System.out.println(number);
        //System.out.println(qt);

    }
}
