import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDOfArray {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(reader.readLine());
	while(T-- > 0) {
		long length = Long.parseLong((reader.readLine()));
		long[] arr = new long[(int) length];
		String[] arrayElements = reader.readLine().trim().split(" ");
		for(int i=0; i< length; i++) {
			arr[i] = Long.parseLong(arrayElements[i]);
		}
		long result = arr[0];
		for(int i=1; i< length; i++) {
			result = gcd(result, arr[i]);
		}
		System.out.println(result);
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
