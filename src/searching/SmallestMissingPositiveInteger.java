package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestMissingPositiveInteger {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			
			int index = findFirstPositiveIndex(arr, n);
			int[] arr2 = new int[n-index];
			int len = arr2.length;
			int y =0;
			for(int i = index; i< n; i++) {
				arr2[y] = arr[i];
				y++;
			}
			
			int smallestMissingPositiveInteger = smallestMissingPositiveInteger(arr2, len);
			System.out.println(smallestMissingPositiveInteger);
		}
	}
	public static int smallestMissingPositiveInteger(int[] arr, int n) {
		for(int i=0; i< n; i++) {
			int x = arr[i];
			if(x <n && x > 0) {
				arr[x] = - arr[x];
			}
		}
		for(int i=0; i<n; i++) {
			if(arr[i] > 0) {
				return i+1;
			}
		}
		return n+1;
	}
	public static int findFirstPositiveIndex(int[] arr, int n) {
		int j=0;
		for(int i=0; i < n; i++) {
			if(arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return j;
	}
//	public static int smallestMissingInteger(int[] arr, int n) {
//		int[] temp = new int[Integer.MAX_VALUE];
//		for(int i =0; i<n; i++) {
//			if(arr[i] > 0) {
//				temp[i]= 1;
//			}
//		}
//		for(int i=0; i<n; i++) {
//			if(temp[i] == 0) {
//				return i;
//			}
//		}
//		return n+1;
//	}
}
