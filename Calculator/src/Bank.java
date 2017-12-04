import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        BigDecimal amount = new BigDecimal(1);
        BigDecimal percent = new BigDecimal(1);
        BigDecimal percent2 = new BigDecimal(100);
        BigDecimal balans = new BigDecimal(1);
        BigDecimal add = new BigDecimal(1);
        double year=0;
        System.out.println("Введите сумму вклада");
        while(true) {
            try {
                amount = input.nextBigDecimal();
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Повторите ввод вклада");
                continue;
            }
            if (amount.compareTo(BigDecimal.ZERO)  < 0) {
                System.out.println("Вклад не может быть отрицательным, повторите ввод.");
            }else {break;}
        }
        System.out.println("Введите процент:");
        while (true) {
                try {
                    percent = input.nextBigDecimal();
                } catch (Exception e) {
                    input.nextLine();
                    System.out.println("Повторите ввод");
                    continue;
                }
                if (percent.signum() < 0) {
                    System.out.println("Годовой процент не может быть отрицательным, повторите ввод.");
                }else{break;}
            }
                percent=percent.divide(percent2);
        //System.out.println(percent);
        System.out.println("На какой срок хотите разместить свой вклад:");
        while (true) {
            try {
                year = input.nextInt();
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Повторите ввод");
                continue;
            }
            if (year < 0) {
                System.out.println("Количетсво лет не может быть отрицательным, повторите ввод.");
            }else{break;}
        }
        balans=amount;
        //System.out.println(balans);
        System.out.println("Результат депозита");
        for(int i=1; i<=year; i++){
            add = balans.multiply(percent);
            balans=balans.add(add);
            System.out.println("Год "+i);
            System.out.println("Процент " +add);
            System.out.println("Баланс на счету " +balans);

        }
        }

}
