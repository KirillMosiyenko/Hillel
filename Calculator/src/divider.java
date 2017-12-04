import java.util.InputMismatchException;
import java.util.Scanner;



public class divider {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int number =0;
        //int dv =0;
        System.out.println("Введите число");
        while(true) {
            try {
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException exc) {
                scanner.nextLine();
                System.out.println("Повторите ввод");
            }
        }
        System.out.println("Делители числа "+number);
        for(int i=1; i<=number; i++){
            if(number%i==0){
                System.out.println(i);
            }
        }

    }
}
