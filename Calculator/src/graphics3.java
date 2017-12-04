import java.util.Scanner;

public class graphics3 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int m=0;
        int n=0;
        System.out.println("Введите ширину.");
        m=scan.nextInt();
        System.out.println("введите высоту");
        n=scan.nextInt();
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (i %2 != 0) {
                    if (j %2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j %2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
