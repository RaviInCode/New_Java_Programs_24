import java.util.Scanner;
public class SecondLargest {
   public static int findSecondLargest(int arr[],int n){
    int temp;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i] > arr[j]){
                temp=arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
             }
        }
    }
    return arr[n-2];
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array");
    int size = sc.nextInt();
    int arr[] = new int[5];
    System.out.println("Enter the element");
    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("The Second Largest Number is: " + findSecondLargest(arr,size));
   
   }
}
