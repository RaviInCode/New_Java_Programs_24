import java.util.Scanner;
class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements : ");
        int numbers[] = new int[size];
        
        for(int i=0; i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number which you want to search: ");
        int x = sc.nextInt();
        //output
        for(int i=0;i<numbers.length;i++){
           if( numbers[i] == x){
             System.out.println("The Value is Matched at index: " + i);
            }
        }

    }
} 
    

