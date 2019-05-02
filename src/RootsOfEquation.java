import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RootsOfEquation {
public static void main(String[] args) throws IOException {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	int T = Integer.parseInt(reader.readLine());
	while(T-- > 0) {
		String[] coefficients = reader.readLine().trim().split(" ");
		int a = Integer.parseInt(coefficients[0]);
		int b = Integer.parseInt(coefficients[1]);
		int c = Integer.parseInt(coefficients[2]);
		double temp = (Math.pow(b, 2) - 4*a*c);
		if(a == 0) {
			System.out.println("Invalid");
		}
		else if(b*b < (4*a*c)) {
			System.out.println("Imaginary");
		}
		else {
			double root1 = Math.floor((-b + Math.sqrt(temp))/(2*a));
			double root2 = Math.floor((-b - Math.sqrt(temp))/(2*a));
			System.out.println((int)root1+" "+(int)root2);
		}
		
	}
}
}
