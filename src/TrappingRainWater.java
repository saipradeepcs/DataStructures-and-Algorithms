import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrappingRainWater {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int[] arr = new int[n];
			for(int i=0; i< n; i++) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			int[] leftMax = new int[n];
			int[] rightMax = new int[n];
//			maintain left max till the index
			leftMax[0] = arr[0];
			int maxLeft = arr[0];
			for(int i=1; i<n; i++) {
				if(maxLeft < arr[i]) {
					maxLeft = arr[i];
					leftMax[i] = maxLeft;
				}else {
					leftMax[i] = maxLeft;
				}
			}
//			maintain right max till the index from right side
			rightMax[n-1] = arr[n-1];
			int maxRight = arr[n-1];
			for(int i = n-2; i>=0; i--) {
				if(maxRight < arr[i]) {
					maxRight= arr[i];
					rightMax[i] = maxRight;
				}else {
					rightMax[i] = maxRight;
				}
			}
			int trappedRainWater=0;
			for(int i=0; i<n; i++) {
				trappedRainWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
			}
			System.out.println(trappedRainWater);
		}
	}
}
