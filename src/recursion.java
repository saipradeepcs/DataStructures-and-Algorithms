
public class recursion {

	public static void main(String[] args) {
		int n =5;
		int a=1, b=2, c=3;
		System.out.println("start");
		System.out.println(maxUnits(n , a, b, c));
	}
	static int maxUnits(int n, int a, int b, int c) {
		
//		System.out.println(n-a+", "+a+","+b+","+c);
//		System.out.println(n-b+", "+a+","+b+","+c);
//		System.out.println(n-c+", "+a+","+b+","+c);
		System.out.println("function call");
		if(n < 0) {
			return -1;
		}
		if(n==0) {
			return 0;
		}
		int cA = maxUnits(n-a, a, b, c);
		int cB = maxUnits(n-b, a, b, c);
		int cC = maxUnits(n-c, a, b, c);
		
		int result = Math.max(cA, Math.max(cB, cC));
		if(result == -1) {
			return -1;
		}
		else {
			return result+1;
		}
	}
	
}
