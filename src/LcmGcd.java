import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LcmGcd {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(reader.readLine());
	while(T-- > 0) {
		String[] numbers = reader.readLine().trim().split(" ");
		long a = Integer.parseInt(numbers[0]);
		long b = Integer.parseInt(numbers[1]);
		long gcd = gcd(a,b);
		long lcm = (a*b)/(gcd);
		System.out.println(lcm+" "+gcd);
				
	}
}
public static long gcd(long a, long b) {
	if(a==0) {
		return b;
	}
	if(a > b) {
		return gcd(a%b, b);
	}
		return gcd(b%a, a);		
}
}
