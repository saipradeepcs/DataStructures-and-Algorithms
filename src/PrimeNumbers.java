import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(reader.readLine());
	while(T-- > 0) {
		int number = Integer.parseInt(reader.readLine());
		System.out.println(isPrime(number));
	}
}
public static String isPrime(int n) {
	if(n <=1) {
		return "No";
	}
	if(n <= 3) {
		return "Yes";
	}
	if(n%2 ==0 || n%3 == 0) {
		return "No";
	}
	for(int i=5; i*i <= n; i=i+6) {
		if((n%i == 0) || (n%(i+2)==0)) {
			return "No";
		}
		
	}	return "Yes";
}
}
