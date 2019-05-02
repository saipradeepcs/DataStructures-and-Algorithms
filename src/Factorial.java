import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-- > 0){
			int number = scan.nextInt();
//			System.out.println(factorial(number));
			System.out.println(numberOfDigits(number));
			
	}
	}
	public static int factorial(int n) {
		int x = 1;
		if(n ==0 || n ==1) {
			return 1;
		}
		for(int i=n; i>1; i--){
			x= x*i;
		}
		return x;
	
}
	public static int numberOfDigits(int n) {
		long number = factorial(n);
		int count =0;
		while(number!=0) {
			count++;
			number=number/10;
			
		}
		return count;
		
	}
}

