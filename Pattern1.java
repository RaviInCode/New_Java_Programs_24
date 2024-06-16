import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number for make Tringle: ");
        int n = scan.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();

        }
            
    }
}