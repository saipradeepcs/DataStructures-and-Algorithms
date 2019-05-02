import java.util.Scanner;

public class WaveArray {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int t=sc.nextInt(); //input testcases
	    
	    while(t-->0) //Loop until we exhaust all testcases
	    {
	        int n=sc.nextInt(); //Input size of array n
	        int arr[]=new int[n]; //Declaring the array
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            arr[i]=x; //Assigning elements to array
	        }
	        
	        int[] result = waveArray(arr);
	        for(int i=0; i< result.length; i++) {
	        	System.out.print(result[i]+" ");
	        }
	        System.out.println();
	        
	        
	    }
	}
public static int[] waveArray(int[] arr) {
	int n = arr.length;
	int i,j;
	for(i =0; i<=(n/2)+1; i=i+2 ) {
		j=i+1;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	return arr;
}
}
