import java.util.Scanner;

public class Program {
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
	        
	        int x=sc.nextInt();//Input x
	        int y=sc.nextInt();//Input y
	        
	        MajorityWins obj=new MajorityWins(); //object to call the function
	        obj.majorityWins(arr,n,x,y); //The functions you complete
	        
	        
	    }
	}
}
