import java.util.Scanner;

public class ReArrangeArray {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		       arr[i] = sc.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        arr[i] +=(arr[arr[i]]%n)*n;
		    }
		    for(int i=0; i<n; i++){
		        arr[i] /=n;
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
	}
}
