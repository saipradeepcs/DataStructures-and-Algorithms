package subSequences;

import java.util.Scanner;
import java.util.TreeSet;

public class MaximumProductSubsequence {

	public static void main(String[] args) {
//		int[] arr = {10, 11, 9, 5, 6, 1, 20};
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		       arr[i] = sc.nextInt();
		    }
		    maximumSubSequenceProduct(arr, n);
		}
	}
public static void maximumSubSequenceProduct(int[] arr, int n) {
	int[] greatestLowerElement = new int[n];
	int a=0,b=0,c=0;
	TreeSet<Integer> tr = new TreeSet<Integer>();
	for(int i=0; i<n; i++) {
		tr.add(arr[i]);
		if(tr.lower(arr[i])==null) {
			greatestLowerElement[i] = -1;
		}else {
//			gives the greatest element less than arr[i]
			greatestLowerElement[i] = tr.lower(arr[i]);
		}
	}
	long maxProd = Integer.MIN_VALUE;
	int temp = arr[n-1];
	for(int i=n-2; i>=1; i--) {
		if(arr[i] > temp) {
			temp = arr[i];
		}else if(greatestLowerElement[i]!= -1){
			long temp1 = greatestLowerElement[i] * arr[i] * temp;
			if(maxProd < temp1) {
				maxProd = temp1;
				a=greatestLowerElement[i];
				b=arr[i];
				c=temp;
			}
		}
	}
	if(a>0) {
		System.out.println(a+" "+b+" "+c);
	}else {
		System.out.println("Not Present");
	}
}
}

/**
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void maxProductSubsequence(int[] arr,int n)
    {
        int a=0,b=0,c=0;
        int[] GreatestLow = new int[n];
        TreeSet<Integer> tr = new TreeSet<Integer>();
        
        for(int i=0;i<n;i++)
        {
            tr.add(arr[i]);
            if(tr.lower(arr[i])==null)
            {
               GreatestLow[i] = -1;
            }
            else
            {
                GreatestLow[i] = tr.lower(arr[i]);
            }
        }
        long maxProd = Integer.MIN_VALUE;
        int temp = arr[n-1];
        for(int i=n-2;i>=1;i--)
        {
            if(arr[i]>temp)
            {
               temp = arr[i];
            }
            else if(GreatestLow[i]!=-1)
            {
                long temp1 = GreatestLow[i] * arr[i] * temp;
                if(maxProd < temp1)
                {
                    maxProd = temp1;
                    a = GreatestLow[i];
                    b = arr[i];
                    c = temp;
                }
            }
            
        }
        if(a>0)
        {
           System.out.println(a+" "+b+" "+c);
        }
        else
        {
            System.out.println("Not Present");
        }
    }
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); 
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++)
		    {
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    maxProductSubsequence(arr, n);
		}
	}

**/