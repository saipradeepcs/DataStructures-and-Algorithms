package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countNumberOfOccurences {

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
			int beg =0;
			int end = n-1;
			int x = k;
			int result;
			int  i = firstOccurence(arr, beg, end, x);
			if(i==-1) {
				result =0;
			}
			int j = lastOccurence(arr, i, end, x);
			if(j==-1) {
				j=0;
			}
			result = j-i+1;
			System.out.println(result);
		}
	}
	static int firstOccurence(int[] arr, int beg, int end, int x) {
		int mid = beg +(end-beg)/2;
		if(end <= beg) {
			if(arr[mid] == x && (mid == 0 || arr[mid-1]!=x)) {
				return mid;
			}else if(x >= arr[mid]) {
				return firstOccurence(arr, mid+1, end, x);
			}else {
				return firstOccurence(arr, beg, mid-1, x);
			}
		}
		return -1;
	}

	static int lastOccurence(int[] arr, int beg, int end, int x) {
		int mid = beg +(end-beg)/2;
		if(end <= beg) {
			if(arr[mid] == x && (mid == arr.length-1 || arr[mid+1]!=x)) {
				return mid;
			}else if(x <= arr[mid]) {
				return lastOccurence(arr, beg, mid-1, x);
			}else {
				return lastOccurence(arr, mid+1, end, x);
			}
		}
		return -1;
	}
}
