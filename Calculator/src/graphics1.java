import java.util.Scanner;

public class graphics1 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int m=0;
        int n=0;
        System.out.println("Введите ширину.");
        m=scan.nextInt();
        System.out.println("введите высоту");
        n=scan.nextInt();
        for(int i=0;i<n; i++){
            for(int j=0;j<m; j++){
                if(i==0||i==n-1){
                    System.out.print('-');
                }else{
                    if(j==0||j==m-1){
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.println("");
        }
    }
}
