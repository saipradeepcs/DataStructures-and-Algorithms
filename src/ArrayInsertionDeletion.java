import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayInsertionDeletion {
	public static void main (String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];
		    
		    for(int i=0;i<sizeOfArray-1;i++)
		    {
		        int x;
		        x=sc.nextInt();
		        arr[i]=x;
		    }
		    
		    int element=sc.nextInt();
		    
		insertItemAtTheEnd(arr,sizeOfArray,element);
		    
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        System.out.print(arr[i]+" ");
		        
		    }
		    
		    System.out.println();
		}
	}

public static int[] insertItemIntoArray(int[] arr, int n, int pos) {
	int length = arr.length;
	int idx = pos-1;
	if(length < n) {
		for(int i= length-1; i>=idx; i--) {
//			arr[i+1] = arr[i]
		}
	}
	System.out.println("Array is full");
		return null;
}
public static void insertItemAtTheEnd(int[] arr, int sizeOfArray, int element) throws NumberFormatException, IOException {
	
	int arrLength = arr.length;
		if(sizeOfArray >= arrLength) {
			arr[sizeOfArray-1] = element;
		}
}
public static void printArray(int[] arr) {
	for(int i=0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
