package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoofTop {
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
		    System.out.println(roofTop(arr, n));
		}
	}
	public static int roofTop(int[] arr, int n) {
		int count = 0, temp =0;
		if(n == 0) {
			return -1;
		}
	    for(int i=1; i < n; i++){
	        if(arr[i] - arr[i-1] >0){
	            count++;
	        }else{
	            temp = Math.max(temp, count);
	            count =0;
	        }
	    }
	    return Math.max(temp, count);
	}
}
