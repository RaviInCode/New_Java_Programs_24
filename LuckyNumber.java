import java.util.Scanner;
class LuckyNumber{
	public static boolean isLuckyNumber(int n,int counter){
		if(n<counter){
			return true;
		}
		if(n%counter == 0){
			return false;
		}
		return isLuckyNumber(n - (n/counter), counter+1);
	}
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Lucky Number: ");
		int n = sc.nextInt();
		int counter = 2;
		System.out.println("The Lucky Number is: " + isLuckyNumber(n,counter));
	}
}