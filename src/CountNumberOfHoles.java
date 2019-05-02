import java.util.Arrays;

public class CountNumberOfHoles {

	public static void main(String[] args) {
		String num = "2537312";
		System.out.println(numberOfHoles(num));
	}
	public static int numberOfHoles(String num) {
		int holesCount=0;
		
		char[] ch = new char[num.length()];
		for(int i=0; i< num.length(); i++) {
			ch[i] = num.charAt(i);
			switch(ch[i]) {
			case '0':
				holesCount++;
				break;
			case '1' :
				break;
			case '2':
				break;
			case '3':
				break;
			case '4':
				holesCount++;
				break;
			case '5':
				break;
			case '6':
				holesCount++;
			case '7':
				break;
			case '8':
				holesCount = holesCount+2;
				break;
			case '9':
				holesCount++;
				break;
			}
	}
	return holesCount;
		
}
	
}
