package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumElementInSortedRotatedArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int[] arr = new int[n];
			for(int i=0; i< n; i++) {
				arr[i] = Integer.parseInt(strs[i]);	
			}
			int pivot = findPivot(arr);
			if(pivot == -1) {
				System.out.print(arr[n-1]);
			}else {
				System.out.println(arr[pivot-1]);
			}
		}
	}
	public static int findPivot(int[] arr) {
		int beg=0;
		int end = arr.length -1;
		while(end >= beg) {
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
}
