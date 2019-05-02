package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchElementInRotatedSortedArray {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -- > 0) {
			int n= Integer.parseInt(br.readLine());
			int x = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			int pivotIndex = findPivot(arr, n);
			int pivot = arr[pivotIndex];
			if(pivotIndex == -1) {
				System.out.println("element:"+x+" is not present in the give array");
			}
			if(pivot  == x) {
				System.out.println(pivotIndex);
			}
			int result;
			
			if(arr.length>0) {
				result = binarySearch(arr, 0, pivotIndex-1, x);
				if(result != -1) {
					System.out.println(result);
				}else {
					result = binarySearch(arr, pivotIndex+1, arr.length-1, x);
					System.out.println(result);
				}
			}
 		}
	}
	public static int findPivot(int[] arr, int n) {
		int beg = 0;
		int end = n-1;
		while(end>=beg) {
			int mid = beg + (end-beg)/2;
			if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]) {
				return mid;
			}else if(arr[mid] > arr[0]) {
				beg = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] arr, int beg, int end, int x) {
		while(end >= beg) {
			int mid = beg + (end-beg)/2;
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] > x) {
				end = mid-1;
			}else {
				beg = mid+1;
			}
		}
		return -1;
	}
}
