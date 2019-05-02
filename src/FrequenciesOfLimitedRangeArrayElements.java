import java.util.Scanner;

public class FrequenciesOfLimitedRangeArrayElements {
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
	        
//	        int[] result = frequenciesOfLimitedRangeArrayElements(arr, arr.length);
//	        for(int i=0; i< result.length; i++) {
//	        	System.out.print(result[i]+" ");
//	        }
	        printfrequency(arr, arr.length);
	        System.out.println();
	        
	        
	    }
	}
//	O(n) space
public static int[] frequenciesOfLimitedRangeArrayElements(int[] arr, int n) {
//	int max = findMax(arr, n);
	int[] resArr =new int[n];
	for(int i=0; i < n; i++) {
		int count =0;
		if(arr[i] > 0) {			
			count = count+1;
			resArr[arr[i]-1] = resArr[arr[i]-1]+count;
		}
	}
	return resArr;
	
}
//O(1) space
static void printfrequency(int arr[], int n)  
{ 
    // Subtract 1 from every element so that the elements 
    // become in range from 0 to n-1 
    for (int j = 0; j < n; j++) 
        arr[j] = arr[j] - 1; 

    // Use every element arr[i] as index and add 'n' to 
    // element present at arr[i]%n to keep track of count of 
    // occurrences of arr[i] 
    for (int i = 0; i < n; i++) 
        arr[arr[i] % n] = arr[arr[i] % n] + n; 

    // To print counts, simply print the number of times n 
    // was added at index corresponding to every element 
    for (int i = 0; i < n; i++) 
        System.out.println(i + 1 + "->" + arr[i] / n); 
} 
private static int findMax(int[] arr, int n) {
	int max =0;
	for(int i=0; i< n; i++) {
		if(arr[i] > max) {
			max = arr[i];
		}
	}
	return max;
}
}
