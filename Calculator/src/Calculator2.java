import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator2 {
    public static void main(String args[]) throws java.io.IOException {
        double a =1;
        double b=1;

        Scanner scanner = new Scanner(System.in);
        // блок выбора чисел
        System.out.println("Введите первое число:");
        while(true){
            try{
                a = scanner.nextDouble();
                break;
            }
            catch(InputMismatchException exc){
                System.out.println(scanner.nextLine() + " не является числом повторите ввод:");
            }
        }
        System.out.println("Введите второе число:");
        while(true){
            try{
                b=scanner.nextDouble();
                break;
            }
            catch(InputMismatchException exc) {
                System.out.println(scanner.nextLine()+" не является числом повторите ввод");
            }
        }
        //Блок действий и его выбор.
        System.out.println("Выберите действие:");
        char choise = scanner.next().charAt(0);
        switch(choise){
            case '+':
                System.out.println("Сумма ="+(a+b));
                break;
            case '-':
                System.out.println("Сумма ="+(a-b));
                break;
            case '/':
                if(b!=0){
                System.out.println("Деление ="+(a/b));
                }
                else{
                    System.out.println("Деление на 0.");
                }
                break;
            case '*':
                System.out.println("Умножение ="+(a*b));
                break;
                }
                System.out.println("end");
        }
    }
