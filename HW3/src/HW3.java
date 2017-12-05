import java.util.Scanner;

public class HW3 {

    public static void main(String[] ars){
        Sum();
        Rectangle();
    }
    public static void Sum(){
        int a = 123;
        int b = 202;
        int sum1=0;
            int sum2=0;
        while (a!=0) {
            sum1 +=(a % 10);
            a /= 10;
            continue;
        }
        System.out.println(sum1+" ");
        while (b!=0) {
            sum2 +=(b % 10);
            b /= 10;
            continue;
        }
        System.out.println(sum2+" ");
    }

    // наличие точки в прямоугольнике

    public static void Rectangle(){
        Scanner Scan = new Scanner(System.in);
        double x1, x2, y1, y2, x, y;
        System.out.println("Enter X coordinate of upper left corner");
        x1 = Scan();
        System.out.println("Enter Y coordinate of upper left corner");
        y1 = Scan();
        System.out.println("Enter X coordinate of lower right corner");
        x2 = Scan();
        System.out.println("Enter Y coordinate of lower right corner");
        y2= Scan();
        System.out.println("Enter X coordinate");
        x= Scan();
        System.out.println("Enter Y coordinate");
        y = Scan();
        if(x>=x1 & x<=x2 & y>=y1 & y<=y2 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }




    public static double Scan() {
        double value;
        Scanner scan = new Scanner(System.in);
        try {
            value = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Please, enter number in correct form.");
            return Scan();
        }
        return value;
    }
}
