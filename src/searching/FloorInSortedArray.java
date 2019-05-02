package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class FloorInSortedArray {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -- > 0) {
			String line1 = br.readLine();
			String[] lengthAndKey = line1.trim().split("\\s+");
			int n = Integer.parseInt(lengthAndKey[0]);
			int x = Integer.parseInt(lengthAndKey[1]);
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int[] arr = new int[n];
			for(int i=0; i< n; i++) {
				arr[i] = Integer.parseInt(strs[i]);
			}

			System.out.println(floorInSortedArrayUsingBinarySearch(arr, 0, arr.length-1, x));
		}
	}
		public static int floorInSortedArray(int[] arr, int n, int x) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0; i<n; i++) {
			ts.add(arr[i]);
		}
		if(ts.contains(x)) {
			return x;
		}else if(ts.lower(x)!= null) {
			return ts.floor(x);
		}
		return -1;
	}
	public static int binarySearch(int[] arr, int beg, int end, int x) {
		while(end >= beg) {
			int mid = beg + (end-beg)/2;
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] > x) {
				end = mid - 1;
			}else {
				beg = mid + 1;
			}
		}
		return -1;
	}
	
	public static int floorInSortedArrayUsingBinarySearch(int[] arr, int beg, int end, int x) {
		if(x == 0) {
			return -1;
		}
		while(end >= beg) {
			int mid = beg + (end - beg)/2;
			if(arr[mid] == x || (arr[mid] < x && mid == arr.length-1) ||(arr[mid] < x && arr[mid+1] > x) ) {
				return mid;
			}
			else if( arr[mid] > x) {
				end = mid -1;
			}else {
				beg = mid + 1;
			}
		}
		return -1;
	}
}
