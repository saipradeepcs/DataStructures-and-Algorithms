package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TwoRepeatedElements {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while( t -- > 0){
		    int n = Integer.parseInt(br.readLine());
		    String line = br.readLine();
		    String[] strs = line.trim().split("\\s+");
		    int[] arr = new int[n+2];
		    for(int i=0; i<n+2;i++){
		        
		        if(arr[Integer.parseInt(strs[i])] == 1){
		            arr[Integer.parseInt(strs[i])] += 1;
		            System.out.print(Integer.parseInt(strs[i]) + " ");
		        }else{
		            arr[Integer.parseInt(strs[i])] = 1;
		        }
		    }
		}
	}
}
