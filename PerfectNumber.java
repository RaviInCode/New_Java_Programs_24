import java.util.Scanner;
class PerfectNumber{
	public static boolean isPerfectNumber(int n){
		int sum = 0;
		for(int i = 1; i < n; i++){
			if(n%i == 0){
				sum = sum+i;
			}
		}
		if(n == sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int n = sc.nextInt();
	System.out.println("The Perfect Number is: "+ isPerfectNumber(n));
   }
}