import java.util.ArrayList;
import java.util.Scanner;

public class RotateAndDelete {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int t=sc.nextInt(); //input testcases
	    
	    while(t-->0) //Loop until we exhaust all testcases
	    {
	        int n=sc.nextInt(); //Input size of array n
	        ArrayList<Integer> al=new ArrayList<Integer>(); //Declaring the array
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            al.add(i,x); //Assigning elements to array
	        }
	        
	        int result = rotateAndDelete(al);
	        
	        System.out.println(result);
	        
	        
	    }
	}
	static int rotateAndDelete(ArrayList<Integer> aList) {
		if(aList.size() == 1) {
			return aList.get(0);
		}
		int k = 0;
		while(k < aList.size()) {
//			rotate
			aList.add(0, aList.get(aList.size()-1));
			
//			remove the last element as it was copied in earlier step at beginning of the list
			aList.remove(aList.size()-1);
			
//			delete n-k+1
			aList.remove(aList.size() - k -1);
			k++;
//			
		}
		return aList.get(0);
	}
//static int rotateAndDelete(int[] arr) {
//	int i=0, k=0;
//	int d=1;
//	int[] rotatedArray = new int[arr.length];
////	copy array elements from arr to rotated array(auxillary array)
//	for( i=0 ; i< arr.length; i++) {
//		rotatedArray[i] = arr[i];
//	}
//	int n=rotatedArray.length;
//	while(n!=1) {
//		 rotatedArray = rightRotateArray(rotatedArray,d,n);
//		k++;
//		if(k>n || (n-k+1) < 0) {
//			deleteElementFromArray(rotatedArray, rotatedArray[0]);
//			n--;
//		}
//		n=deleteElementFromArray(rotatedArray, rotatedArray[n-k]);
//		
//	}
//	return rotatedArray[0];
//}
//static int[] rightRotateArray(int[] arr, int d,int n) {
//	reverseAnArray(arr, 0, n-1);
//	reverseAnArray(arr, 0, d-1);
//	reverseAnArray(arr, d, n-1);
//	
//	return arr;
//}
//public static int[] reverseAnArray(int[] arr, int low, int high) {
//	while(low < high) {
//		
//		int temp=0;
//		temp =arr[low];
//		arr[low]=arr[high];
//		arr[high]=temp;
//		low++;
//		high--;
//	}
//	return arr;
//}
//static int deleteElementFromArray(int[] arr, int k) {
//	int idx=0;
//	int n = arr.length;
//	for(int i=0; i< n; i++) {
//		if(arr[i] == k) {
//			idx=i;
//		}
//	}
//	
//	for(int i = idx+1; i< n; i++) {
//		arr[i-1] = arr[i];
//	}
//	n=n-1;
//	return n;
//}
}
