import java.util.Scanner;
class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the number : ");
        int numbers[] = new int[size];
        for(int i=0;i<size;i++){
           numbers[i] = sc.nextInt();
         }
         System.out.println("Every Index value is: ");
         for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
         }
    }
}