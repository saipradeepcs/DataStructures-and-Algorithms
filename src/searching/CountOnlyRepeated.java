package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOnlyRepeated {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -- > 0){
		    int n = Integer.parseInt(br.readLine());
		    String line = br.readLine();
		    String[] strs = line.trim().split("\\s+");
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(strs[i]);
		    }
		    int repeatedElement = findElement(arr, 0, arr.length-1);
		    int firstOccurence = findFirstOccurence(arr, 0, arr.length-1, repeatedElement);
		    int lastOccurence = findLastOccurence(arr, 0, arr.length-1, repeatedElement);
		    System.out.println(repeatedElement+" "+(lastOccurence-firstOccurence+1));
		}
		
	}
	public static int findElement(int[] arr, int beg, int end){
	    while(end>=beg){
	        int mid = beg + (end-beg)/2;
	        if(arr[beg] == arr[end]){
	        return arr[beg];
	    }
	    if((arr[mid] - arr[beg]) < (mid -beg)){
	        end=mid;
	    }
	    if((arr[end]-arr[mid]) < (end-mid)){
	        beg=mid;
	    }
	    }
	    return -1;
	}
	public static int findFirstOccurence(int[] arr, int beg, int end, int x) {
		while(end >= beg) {
			int mid = beg + (end-beg)/2;
			if(arr[mid] == x && (mid == beg || arr[mid-1]!=x)) {
				return mid;
			}else if(arr[mid] >= x) {
				end = mid-1;
			}else {
				beg = mid+1;
			}
		}
		return -1;
	}
	public static int findLastOccurence(int[] arr, int beg, int end, int x) {
		while(end >= beg) {
			int mid = beg + (end-beg)/2;
			if(arr[mid] == x && (mid == end || arr[mid+1]!=x)) {
				return mid;
			}else if(arr[mid] <= x) {
				beg = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
}
