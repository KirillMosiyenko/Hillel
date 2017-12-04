import java.util.Scanner;
public class Even {
    public static void main(String args[]) {
        System.out.println("Введите число");
        Scanner input= new Scanner(System.in);
        int n = 0;
        n=input.nextInt();
        System.out.print("Число " + n + " ");
        if( n % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }
}