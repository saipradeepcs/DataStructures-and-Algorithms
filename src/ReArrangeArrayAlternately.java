import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReArrangeArrayAlternately {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int t=sc.nextInt(); //input testcases
	    
	    while(t-->0) //Loop until we exhaust all testcases
	    {
	        int n=sc.nextInt(); //Input size of array n
//	        int arr[]=new int[n]; //Declaring the array
//	        for(int i=0;i<n;i++)
//	        {
//	            arr[i]=sc.nextInt();
//	             //Assigning elements to array
//	        }
	        
//	    	O(n) solution
//	        StringBuilder sb = new StringBuilder();
//	        int x =0, y = n-1;
//	        while(x<y) {
//	        	sb.append(arr[y]+" "+arr[x]+" ");
//	        	x++;
//	        	y--;
//	        }
//	        if(x==y) {
//	        	sb.append(arr[x]);
//	        }
//	        System.out.println(sb);    
	        List<Integer> al = new ArrayList<Integer>();
	        for(int i=0; i<n;i++) {
	        	al.add(sc.nextInt());
	        }
	        al = reArrangeAlternately(al);
	        for(int i=0; i<n;i++) {
	        	System.out.print(al.get(i)+" ");
	        }
	    }
	}
//	O(n2)solution
	public static int[] reArrangeArray(int[] arr) {
		int n= arr.length;
		for(int i=0; i< n; i++) {
			reverseArray(arr, i,n-1);
		}
		return arr;
	}
	public static int[] reverseArray(int[] arr, int low, int high) {
		int temp;
		while(low<high) {
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		return arr;
	}
//	new solution trying
	public static List<Integer> reArrangeAlternately(List al) {
		int k=0,i=0, n= al.size();
		while(k<n/2) {
			al.add(i, al.get(al.size()-1));
			al.remove(al.size()-1);
			k++;
			i=i+2;
		}
		return al;
	}

	
 }
