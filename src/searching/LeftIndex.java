package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftIndex {

	public static void main(String[] args) throws IOException {
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
			int x = Integer.parseInt(br.readLine());
			System.out.println(findLeftIndex(arr, 0, arr.length-1, x));
		}
	}
	public static int findLeftIndex(int[] arr, int beg, int end, int x) {
		while(end >= beg) {
			int mid = beg + (end-beg)/2;
			if(arr[mid] == x && (mid == 0 || arr[mid-1]!=x)) {
				return mid;
			}else if(arr[mid] >= x) {
				end = mid-1;
			}else {
				beg = mid+1;
			}
		}
		return -1;
	}
}
