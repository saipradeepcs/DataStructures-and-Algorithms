package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String args[]) throws IOException{
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
			System.out.println(majorityElement(arr, n));
		}
	}
	public static int majorityElement(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();	
		for(int i=0; i<n; i++ ) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(Integer i: map.keySet()) {
			if(map.get(i)>arr.length/2) {
				return i;
			}
		}
		return -1;
	}
}
