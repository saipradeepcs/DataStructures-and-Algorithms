package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchElementInUnboundedArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t -- > 0) {
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int[] arr = new int[n];
			for(int i=0; i< n; i++) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			System.out.println(findElementInUpperBoundArray(arr, k));
		}
	}
	public static int findElementInUpperBoundArray(int[] arr, int x) {
		int low = arr[0];
		int high = arr[1];
		if(low == x) {
			return 0;
		}
		int i=1;
		while(high < x) {
			low=i;
			i=i*2;
			high = arr[i];
		}
		int result= binarySearch(arr, low, i, x);
		return result;
		
	}
	static int binarySearch(int[] arr, int beg, int end, int x) {
		while(end>=beg) {
			int mid = beg + (end-beg)/2;
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid]<x) {
				beg=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
}
