import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSubArray_KadanesAlgorithm {

	public static void main(String[] args)throws IOException {
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
			int start=0, end=0, s=0, max_so_far = arr[0], max_till_here = 0, result=0;
			for(int i=0; i<n; i++) {
				max_till_here = max_till_here + arr[i];
				if(max_so_far < max_till_here) {
					max_so_far = max_till_here;
					start=s;
					end=i;
				}
				if(max_till_here < 0) {
					max_till_here=0;
					s=i+1;
				}
			
		}
			for(int i=start; i<=end;i++) {
				 result+=arr[i];
			}
			System.out.println(result);
	}
}
}
